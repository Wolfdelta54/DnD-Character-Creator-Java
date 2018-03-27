import java.util.*;

public class CharacterCreator
{
	private boolean quit;
	
	public CharacterCreator()
	{
		quit = false;
	}	
	
    public void characterCreation() throws Exception
    {
        // initialize objects
        AbilityGen aGen = new AbilityGen();             // done
        Cantrips can = new Cantrips();                  // done
        ClassList classes = new ClassList();            // done
        Feats feats = new Feats();                      // done
        HPGen hpGen = new HPGen();                      // done
        Languages langs = new Languages();              // done
        RaceFeats raceFeats = new RaceFeats();          // done
        RaceInfo raceInfo = new RaceInfo();             // done
        RaceList races = new RaceList();                // done
        Skills skills = new Skills();                   // done
        SpecialFeats specFeats = new SpecialFeats();    // done
        Spells spells = new Spells();                   // done
        StartingEquip equip = new StartingEquip();      // done
        Proficiencies prof = new Proficiencies();       // done
        
        SaveCharacter save = new SaveCharacter();

        Scanner wolf = new Scanner(System.in);

        // initialize class, race, and subrace storage
        String chosenClass;
        String chosenRace;
        String chosenSubRace;
        String[] information = new String[150];
        
        // start of character creation

        System.out.println();
        System.out.println("Race Selection");

        // start of race and subrace selection process
        races.prnt();
        chosenRace = races.getRaceName();
        System.out.println();
        races.prntSubRaceList();
        chosenSubRace = races.getSubRace();
        // end of race and subrace selection process

        // setup info that needs a race and subrace
        raceInfo.setRaceInfo(chosenRace, chosenSubRace);
        langs.setInfo(chosenRace, chosenSubRace);
        raceFeats.setRace(chosenRace, chosenSubRace);
        skills.setRace(chosenRace);

        System.out.println();
        System.out.println("Class Selection");
        // start of class selection process
        System.out.println();
        classes.prnt();
        chosenClass = classes.getClassName();
        // end of class selection process

        // setup info that needs a class
        can.setClass(chosenClass);
        feats.setClass(chosenClass);
        skills.setClass(chosenClass);
        specFeats.setClass(chosenClass);
        spells.setClass(chosenClass);
        equip.setClass(chosenClass);
        prof.setClass(chosenClass);

        System.out.println();
        System.out.println("Ability Scores");

        // ability score generation and assigning
        for(int i = 0; i < 6; i++)
        {
            System.out.println();
            aGen.assignScore(i);
            System.out.print("\nChoose an score to assign :: ");
            int slot = wolf.nextInt() - 1;
            aGen.updateScores(slot, i);
        }
        aGen.addRaceBonus(raceInfo.getIncreasedScores(), raceInfo.getScoreIncreases());
        
        // determine ability modifiers
        for(int i = 0; i < 6; i++)
        {
        	aGen.determineMod(i);
        }

        // generate health
        hpGen.setHP(chosenClass, aGen.getCharismaMod());
        
        // pass ability modifiers to skills class
        skills.setModifierArray(aGen.getAllMods());

        System.out.println();
        System.out.println("Starting Equipment");

        // stating equipment selection
        System.out.println();
        equip.setDex(aGen.getDexterityMod());
        equip.setMods(aGen.getAllMods());
        equip.listChoices();

        // generate special feats
        specFeats.list();
        feats.setChooseSlot(specFeats.getFinal());

        // generate feats
        feats.addRaceFeats(raceFeats.getRaceFeats());
        System.out.println();
        System.out.println("Spell Selection");

        // spell selection process
        for(int i = 0; i < spells.getNumSlots(); i++)
        {
            System.out.println();
            spells.prntList();
            System.out.print("\nChoose a spell :: ");
            int slot = wolf.nextInt() - 1;
            spells.updateList(i, spells.getSpell(slot));
        }

        System.out.println();
        System.out.println("Cantrip Selection");

        // cantrip selection process
        for(int i = 0; i < can.getNumSlots(); i++)
        {
            System.out.println();
            can.prntList();
            System.out.print("\nChoose a cantrip :: ");
            int slot = wolf.nextInt() - 1;
            can.updateList(i, can.getCantrip(slot));
        }

        System.out.println();
        System.out.println("Skill Selection");

        // skill selection process
        for(int i = 0; i < skills.getNumSkills(); i++)
        {
            System.out.println();
            skills.prntList();
            System.out.print("\nChoose a skill :: ");
            int slot = wolf.nextInt() - 1;
            skills.updateList(i, skills.getSkill(slot));
        }
        
        // setting up the info to save
    	String[] tempStorage;
    	int curInfoSlot = 4;
    
    	information[0] = System.lineSeparator() + "--------BASIC INFO--------";
    	information[1] = System.lineSeparator() + "Race    - " + chosenRace;
    	information[2] = System.lineSeparator() + "Subrace - " + chosenSubRace;
    	information[3] = System.lineSeparator() + "Class   - " + chosenClass;
    
    	tempStorage = raceInfo.getInfo();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = langs.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = aGen.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = prof.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	information[curInfoSlot] = System.lineSeparator() + "--------HP & AC--------";
    	curInfoSlot++;
    
    	tempStorage = hpGen.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "AC :: " + equip.getAC();
    	curInfoSlot++;
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = feats.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = equip.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = spells.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = can.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	information[curInfoSlot] = System.lineSeparator() + "";
    	curInfoSlot++;
    
    	tempStorage = skills.getFinal();
    	for(int i = 0; i < tempStorage.length; i++)
    	{
    		information[curInfoSlot] = tempStorage[i];
    		curInfoSlot++;
    	}
    
    	int saveInfoLen = curInfoSlot;
    	
        // view or save options
        System.out.println();
        System.out.println();
        System.out.println("1. View Info, chance to save after viewing");
        System.out.println("2. Skip view and save");
        System.out.println();
        System.out.print("\nWhat would you like to do :: ");
        int view = wolf.nextInt();
        
        // viewing, chance to save at the end
        if(view <= 1)
        {
        	// character information print
        	System.out.println();
        	System.out.println("Your characters' info has been generated and listed below");
        	System.out.println("Write down the provided information on a character sheet to complete this process");
        	System.out.println();
        	System.out.println("--------BASIC INFO--------");
        	System.out.println("Race    - " + chosenRace);
        	System.out.println("Subrace - " + chosenSubRace);
        	System.out.println("Class   - " + chosenClass);
        	raceInfo.prntInfo();
        	System.out.println();
        	langs.prntLangs();
        	System.out.println();
        	aGen.prntFinal();
        	System.out.println();
        	prof.prntFinal();
        	System.out.println();
        	System.out.println("--------HIT POINTS & AC--------");
        	hpGen.prntHP();
        	System.out.println("AC :: " + equip.getAC());
        	System.out.println();
        	feats.prntFinal();
        	System.out.println();
        	equip.prntFinal();
        	System.out.println();
        	spells.prntFinal();
        	System.out.println();
        	can.prntFinal();
        	System.out.println();
        	skills.prntFinal();
        }
        
        // prompts user if they wish to save, regardless of choice above
        
        System.out.println();
        System.out.println();
    	
    	save.saveOption();
    
    	if(save.getChoice() == 'y' || save.getChoice() == 'Y')
    	{
    		save.setSaveInfo(information, saveInfoLen);
    		save.saveInfo();
    	}

        System.out.println();
        System.out.println();
        System.out.println("The character creation process has ended");
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
    
    public boolean getQuit()
    {
    	return quit;
    }
}