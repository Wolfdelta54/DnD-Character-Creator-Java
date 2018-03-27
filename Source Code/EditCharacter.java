import java.io.*;
import java.util.*;

public class EditCharacter
{
    private Scanner wolf = new Scanner(System.in);
    private File chosenFile;
    private Scanner fileReader;
    
    private Packs pack = new Packs();
    
    private ArrayList<String> oldFile = new ArrayList<String>();
    private ArrayList<String> newFile = new ArrayList<String>();
    private String className;
    private String raceName;
    private String subraceName;
    private int[] abilityMods;
    
    private boolean quit;
    
    public EditCharacter()
    {
    	quit = false;
    }
    
    public void characterEdit() throws Exception
    {
    	abilityMods = new int[6];
        LoadCharacter loadChar = new LoadCharacter();
        loadChar.characterLoad();
        chosenFile = loadChar.getFile();
    	OverrideSave override = new OverrideSave(chosenFile);
        fileContents();
        setMods();
        setInfo();
        newFile = oldFile;
        newFile.removeAll(Collections.singleton(null));
        oldFile.removeAll(Collections.singleton(null));
        editMenu();
        newFile.removeAll(Collections.singleton(null));
        oldFile.removeAll(Collections.singleton(null));
        
        String[] contents = new String[newFile.size()];
        contents = newFile.toArray(contents);
        
        override.saveOptions(contents);


        System.out.println();
        System.out.println();
        System.out.println("The character editting process has ended");
        System.out.println("You may -");
        System.out.println();
        System.out.println("1. Return to main menu");
        System.out.println("2. Quit the program");
        System.out.println();
        System.out.print("\nWhat would you like to do :: ");
        int qOrC = wolf.nextInt();
        
        if(qOrC <= 1)
        	quit = true;
        
        else
        	quit = false;
        
        wolf.close();
    }
    
    private void fileContents() throws Exception
    {
        fileReader = new Scanner(chosenFile);
        
        while (fileReader.hasNextLine())
        {
        	String temp = fileReader.nextLine();
        	
            oldFile.add(temp);
        //    newFile.add(temp);
        }
        fileReader.close();
        
        
    }
    
    private void setInfo()
    {
    	String temp = "";
    	
    	for(int i = 0; i < oldFile.indexOf("--------LANGUAGES--------"); i++)
    	{
    		temp = oldFile.get(i);
    		
    		if(temp.indexOf("Class") != -1)
    		{
    			int location = temp.indexOf("-") + 2;
    			className = temp.substring(location);
    		}
    		else if(temp.indexOf("Race") != -1)
    		{
    			int location = temp.indexOf("-") + 2;
    			raceName = temp.substring(location);
    		}
    		else if(temp.indexOf("Subrace") != -1)
    		{
    			int location = temp.indexOf("-") + 2;
    			subraceName = temp.substring(location);
    		}
    	}
    }
    
    public String getInfo()
    {
    	String output = "Class - " + className + "\nRace - " + raceName + "\nSubrace - " + subraceName;
    	return output;
    }
    
    private void editMenu()
    {
        System.out.println();
        System.out.println("Character Race, Sub-Race, and Class cannot be edited");
        System.out.println("1. Ability Scores");
        System.out.println("2. Chosen Cantrips");
        System.out.println("3. Chosen Spells");
        System.out.println("4. Chosen Skills");
        System.out.println("5. Starting Equipment");
        System.out.println("6. Everything");
        System.out.println();
        System.out.print("What would you like to edit :: ");
        int option = wolf.nextInt();
        subMenus(option);
    }
    
    private void subMenus(int subMenu)
    {
        if(subMenu <= 1)
            editAbilities();
        else if(subMenu == 2)
            editCantrips();
        else if(subMenu == 3)
            editSpells();
        else if(subMenu == 4)
            editSkills();
        else if(subMenu == 5)
            editEquip();
        else
            editAll();
    }
    
    private void editAbilities()
    {
    	RaceInfo raceInfo = new RaceInfo();
        AbilityGen aGen = new AbilityGen();
        HPGen hpGen = new HPGen();
        raceInfo.setRaceInfo(raceName, subraceName);
        for(int i = 0; i < 6; i++)
        {
            System.out.println();
            aGen.assignScore(i);
            System.out.print("\nChoose an score to assign :: ");
            int slot = wolf.nextInt() - 1;
            aGen.updateScores(slot, i);
        }
        aGen.addRaceBonus(raceInfo.getIncreasedScores(), raceInfo.getScoreIncreases());

        // generate health
        hpGen.setHP(className, aGen.getCharismaMod());
        

    	
    	int startIndex = oldFile.indexOf("--------ABILITY SCORES--------");
    	int endIndex = oldFile.indexOf("--------PROFICIENCIES--------") - 3;
    	int hpIndex = oldFile.indexOf("--------HP & AC--------") + 2;
    	
    	String[] replacementInfo = new String[aGen.getFinal2().length];
    	
    	for(int i = 0; i < aGen.getFinal2().length; i++)
    	{
    		replacementInfo[i] = aGen.getFinal2()[i];
    	}
    	
    	int curFileIndex = startIndex;
    	
    	for(int i = endIndex; i >= startIndex; i--)
    	{
    		oldFile.remove(startIndex);
    	}
    	
    	for(int i = 0; i < replacementInfo.length; i++)
    	{
    		newFile.add(curFileIndex, replacementInfo[i]);
    		curFileIndex++;
    	}
    	
    	newFile.set(hpIndex, "Hit Points :: " + hpGen.getFinal2());
    }
    
    private void editCantrips()
    {
    	Cantrips can = new Cantrips();
    	can.setClass(className);
    	
        for(int i = 0; i < can.getNumSlots(); i++)
        {
            System.out.println();
            can.prntList();
            System.out.print("\nChoose a cantrip :: ");
            int slot = wolf.nextInt() - 1;
            can.updateList(i, can.getCantrip(slot));
        }
    	
    	int startIndex = oldFile.indexOf("--------CANTRIPS--------");
    	int endIndex = oldFile.indexOf("--------SKILLS--------") - 4;
    	
    	String[] replacementInfo = new String[can.getFinal2().length];
    	
    	for(int i = 0; i < can.getFinal2().length; i++)
    	{
    		replacementInfo[i] = can.getFinal2()[i];
    	}
    	
    	int curFileIndex = startIndex;
    	
    	for(int i = endIndex; i >= startIndex; i--)
    	{
    		oldFile.remove(startIndex);
    	}
    	
    	for(int i = 0; i < replacementInfo.length; i++)
    	{
    		newFile.add(curFileIndex, replacementInfo[i]);
    		curFileIndex++;
    	}
    }
    
    private void editSpells()
    {
    	Spells spells = new Spells();
    	spells.setClass(className);
    	
        for(int i = 0; i < spells.getNumSlots(); i++)
        {
            System.out.println();
            spells.prntList();
            System.out.print("\nChoose a spell :: ");
            int slot = wolf.nextInt() - 1;
            spells.updateList(i, spells.getSpell(slot));
        }
    	
    	int startIndex = oldFile.indexOf("--------SPELLS--------");
    	int endIndex = oldFile.indexOf("--------CANTRIPS--------") - 4;
    	
    	String[] replacementInfo = new String[spells.getFinal2().length];
    	
    	for(int i = 0; i < spells.getFinal2().length; i++)
    	{
    		replacementInfo[i] = spells.getFinal2()[i];
    	}
    	
    	int curFileIndex = startIndex;
    	
    	for(int i = endIndex; i >= startIndex; i--)
    	{
    		newFile.remove(i);
    	}
    	
    	for(int i = 0; i < replacementInfo.length; i++)
    	{
    		newFile.add(curFileIndex, replacementInfo[i]);
    		curFileIndex++;
    	}
    }
    
    private void editSkills()
    {
    	Skills skill = new Skills();
    	skill.setClass(className);
    	skill.setModifierArray(abilityMods);

        for(int i = 0; i < skill.getNumSkills(); i++)
        {
            System.out.println();
            skill.prntList();
            System.out.print("\nChoose a skill :: ");
            int slot = wolf.nextInt() - 1;
            skill.updateList(i, skill.getSkill(slot));
        }
    	
    	int startIndex = oldFile.indexOf("--------SKILLS--------");
    	int endIndex = oldFile.size() - 1;
    	
    	String[] replacementInfo = new String[skill.getFinal2().length];
    	
    	for(int i = 0; i < skill.getFinal2().length; i++)
    	{
    		replacementInfo[i] = skill.getFinal2()[i];
    	}
    	
    	int curFileIndex = startIndex;
    	
    	for(int i = endIndex; i >= startIndex; i--)
    	{
    		newFile.remove(i);
    	}
    	
    	for(int i = 0; i < replacementInfo.length; i++)
    	{
    		newFile.add(curFileIndex, replacementInfo[i]);
    		curFileIndex++;
    	}
    }
    
    private void editEquip()
    {
    	StartingEquip equipEdit = new StartingEquip();
    	equipEdit.setClass(className);
        equipEdit.setDex(abilityMods[2]);
        equipEdit.setMods(abilityMods);
        equipEdit.listChoices();
        pack.setPack(equipEdit.getPack());
        pack.setContents();
    	
    	int startIndex = oldFile.indexOf("--------EQUIPMENT--------");
    	int endIndex = oldFile.indexOf("--------SPELLS--------") - 3;
    	
    	int acIndex = oldFile.indexOf("AC ::");
    	
    //	for(int i = startIndex; i < endIndex; i++)
    //	{
    //		toReplace.add(oldFile.get(i));
    //	}
    	
    	oldFile.set(acIndex, ("AC :: " + equipEdit.getAC()));
    	
    	String[] replacementInfo = new String[equipEdit.getFinal2().length + 4];
    	int curSlot = 0;
    	
    	for(int i = 0; i < equipEdit.getFinal2().length; i++)
    	{
    		replacementInfo[i] = equipEdit.getFinal2()[i];
    		curSlot++;
    	}
	    
	    replacementInfo[curSlot] ="null--------Pack Contents--------";
	    curSlot++;
	    
	    replacementInfo[curSlot] = "null" + pack.getFinal2()[0];
	    
    	int curFileIndex = startIndex;
    	
    	for(int i = endIndex; i >= startIndex; i--)
    	{
    		newFile.remove(i);
    	}
    	
    	for(int i = 0; i < replacementInfo.length; i++)
    	{
    		newFile.add(curFileIndex, replacementInfo[i]);
    		curFileIndex++;
    	}
    }
    
    private void setMods()
    {
    	int startIndex = oldFile.indexOf("--------ABILITY SCORES--------");
    	int endIndex = oldFile.indexOf("--------PROFICIENCIES--------");
    	int curModSlot = 0;
    	
    	for(int i = startIndex + 1; i < endIndex; i++)
    	{
    		if(oldFile.get(i).indexOf("-") != -1)
    		{
    			int temp = Integer.parseInt(oldFile.get(i).substring(oldFile.get(i).length() - 2));
    			abilityMods[curModSlot] = temp;
    			curModSlot++;
    		}
    	}
    }
    
    private void editAll()
    {
    	editAbilities();
    	editCantrips();
    	editSpells();
    	editSkills();
    	editEquip();
    }
    
    public boolean getQuit()
    {
    	return quit;
    }
}