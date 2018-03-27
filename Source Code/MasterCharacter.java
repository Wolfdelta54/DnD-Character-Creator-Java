import java.util.Scanner;

public class MasterCharacter 
{
	public MasterCharacter()
	{
	}	
	
    public void createMasterCharacter() throws Exception
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
        
        // start of master information creation
        
        races.setRaceName(0);
        races.setSubRaceName(5);
        
        chosenRace = races.getRaceName();
        chosenSubRace = races.getSubRace();

        // setup info that needs a race and subrace
        raceInfo.setRaceInfo(chosenRace, chosenSubRace);
        langs.setInfo(chosenRace, chosenSubRace);
        raceFeats.setRace(chosenRace, chosenSubRace);
        
        // start of class selection process
        classes.setClassName(4);
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

        // ability score generation and assigning
        aGen.masterCharacter();
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

        // stating equipment selection
        equip.setDex(aGen.getDexterityMod());
        equip.setMods(aGen.getAllMods());
        equip.masterCharacter();

        // setting special feats
        specFeats.setChoice(5);
        feats.setChooseSlot(specFeats.getFinal());

        // setting feats
        feats.addRaceFeats(raceFeats.getRaceFeats());

        // setting spells
        spells.updateList(0, spells.getSpell(0));

        // setting cantrips
        can.updateList(0, can.getCantrip(0));

        // setting skills
        skills.updateList(1, skills.getSkill(2));
        skills.updateList(0, skills.getSkill(0));
        
        // saving information
        String[] tempStorage;
        int curInfoSlot = 4;
        
        information[0] = "--------BASIC INFO--------";
        information[1] = "nullRace    - " + chosenRace;
        information[2] = "nullSubrace - " + chosenSubRace;
        information[3] = "nullClass   - " + chosenClass;
        
        tempStorage = raceInfo.getCodeInfo();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = "null" + tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "null";
        curInfoSlot++;
        
        tempStorage = langs.getCodeFinal();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "null";
        curInfoSlot++;
        
        tempStorage = aGen.getFinal2();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "null";
        curInfoSlot++;
        
        tempStorage = prof.getCodeFinal();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "null";
        curInfoSlot++;
        
        information[curInfoSlot] = "null--------HP & AC--------";
        curInfoSlot++;
        
        tempStorage = hpGen.getCodeFinal();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = "null" + tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "nullAC :: " + equip.getAC();
        curInfoSlot++;
        
        information[curInfoSlot] = "null";
        curInfoSlot++;
        
        tempStorage = feats.getCodeFinal();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "null";
        curInfoSlot++;
        
        tempStorage = equip.getFinal2();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "";
        curInfoSlot++;
        
        tempStorage = spells.getFinal2();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "";
        curInfoSlot++;
        
        tempStorage = can.getFinal2();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        information[curInfoSlot] = "";
        curInfoSlot++;
        
        tempStorage = skills.getFinal2();
        for(int i = 0; i < tempStorage.length; i++)
        {
            information[curInfoSlot] = tempStorage[i];
            curInfoSlot++;
        }
        
        save.setMasterSave();
        save.setCodeSaveInfo(information);
        save.codeSaveInfo();
        
        wolf.close();
    }

}
