import java.util.*;

public class Languages
{
	private String[] knownLangs;
	private String[] raceProLangs;
	private String[] allLangsList;
	private String race;
	private String subrace;
	private int raceLangs;
	private boolean raceLangChoice = false;
	private ArrayList<String> tempStorage = new ArrayList<String>();
	private String chosenLang;

	private Scanner wolf = new Scanner(System.in);

	public Languages()
	{
	}

	public void setInfo(String raceName, String subraceName)
	{
		race = raceName;
		subrace = subraceName;

		setRaceLimits();
		setLists();
		knownLangs = raceProLangs;
	}

	private void setRaceLimits()
	{
		if(race.equalsIgnoreCase("Dragonborn"))
		{
			raceLangs = 0;
		}
		else if(race.equalsIgnoreCase("Dwarf"))
		{
			if(subrace.equalsIgnoreCase("Gray"))
			{
				raceLangs = 1;
			}
			else
			{
				raceLangs = 0;
			}
		}
		else if(race.equalsIgnoreCase("Elf"))
		{
			raceLangs = 0;
		}
		else if(race.equalsIgnoreCase("Gnome"))
		{
			if(subrace.equalsIgnoreCase("Deep"))
			{
				raceLangs = 1;
			}
			else
			{
				raceLangs = 0;
			}
		}
		else if(race.equalsIgnoreCase("Half-Elf"))
		{
			raceLangs = 1;
			raceLangChoice = true;
		}
		else if(race.equalsIgnoreCase("Half-Orc"))
		{
			raceLangs = 0;
		}
		else if(race.equalsIgnoreCase("Halfling"))
		{
			raceLangs = 0;
		}
		else if(race.equalsIgnoreCase("Human"))
		{
			raceLangs = 1;
			raceLangChoice = true;
		}
		else if(race.equalsIgnoreCase("Tiefling"))
		{
			raceLangs = 0;
		}
	}

	private void setLists()
	{
		allLangsList  = new String[16];
		allLangsList[0] = "Common"; // all playable races
		allLangsList[1] = "Dwarvish"; // Dwarves
		allLangsList[2] = "Elvish"; // Elves and Half-Elves
		allLangsList[3] = "Giant";
		allLangsList[4] = "Gnomish"; // Gnomes
		allLangsList[5] = "Goblin";
		allLangsList[6] = "Halfling"; // Halflings
		allLangsList[7] = "Orc"; // Half-Orcs
		allLangsList[8] = "Abyssal";
		allLangsList[9] = "Celestial";
		allLangsList[10] = "Draconic"; // Dragonborn
		allLangsList[11] = "Deep Speech";
		allLangsList[12] = "Infernal"; // Tiefling
		allLangsList[13] = "Primordial";
		allLangsList[14] = "Sylvan";
		allLangsList[15] = "Undercommon"; // Deep Gnomes
		
		setRaceLangs();
	}

	private void setRaceLangs()
	{
		raceProLangs = new String[2 + raceLangs];
		raceProLangs[0] = "Common";

		if(race.equalsIgnoreCase("Dragonborn"))
		{
			raceProLangs[1] = "Draconic";
		}
		else if(race.equalsIgnoreCase("Dwarf"))
		{
			if(subrace.equalsIgnoreCase("Gray"))
			{
				raceProLangs[1] = "Dwarvish";
				raceProLangs[2] = "Undercommon";
			}
			else
			{
				raceProLangs[1] = "Dwarvish";
			}
		}
		else if(race.equalsIgnoreCase("Elf"))
		{
			raceProLangs[1] = "Elvish";
		}
		else if(race.equalsIgnoreCase("Gnome"))
		{
			if(subrace.equalsIgnoreCase("Deep"))
			{
				raceProLangs[1] = "Gnomish";
				raceProLangs[2] = "Undercommon";
			}
			else
			{
				raceProLangs[1] = "Gnomish";
			}
		}
		else if(race.equalsIgnoreCase("Half-Elf"))
		{
			raceProLangs[1] = "Elvish";
			chooseExtra(raceLangChoice);
			raceProLangs[2] = chosenLang;
		}
		else if(race.equalsIgnoreCase("Half-Orc") || race.equalsIgnoreCase("Orc"))
		{
			raceProLangs[1] = "Orc";
		}
		else if(race.equalsIgnoreCase("Halfling"))
		{
			raceProLangs[1] = "Halfling";
		}
		else if(race.equalsIgnoreCase("Human"))
		{
			chooseExtra(raceLangChoice);
			raceProLangs[1] = chosenLang;
		}
		else if(race.equalsIgnoreCase("Tiefling"))
		{
			raceProLangs[1] = "Infernal";
		}
	}

	private void chooseExtra(boolean can)
	{
		if(can == true)
		{
			String[] unknownLangs = getUnknownLangs();
			for(int i = 0; i < unknownLangs.length; i++)
			{
				int slot = i + 1;
				System.out.println(slot + ". " + unknownLangs[i]);
			}
			System.out.print("\nChoose a language to learn :: ");
			String selLang = unknownLangs[wolf.nextInt() - 1];
			setChosenLang(selLang);
		}
	}

	private String[] getUnknownLangs()
	{
		for(String element : allLangsList)
		{
			tempStorage.add(element);
		}
		
		for(int i = 0; i < raceProLangs.length - 1; i++)
		{
			updateUnknown(raceProLangs[i]);
		}
		String[] array = new String[tempStorage.size()];
		tempStorage.removeAll(Collections.singleton(null));
		array = tempStorage.toArray(array);

		return array;
	}

	private void updateUnknown(String knownLang)
	{
		if(tempStorage.contains(knownLang))
		{
			tempStorage.remove(knownLang);
		}
	}

	private void setChosenLang(String sel)
	{
		chosenLang = sel;
	}

	public void prntLangs()
	{
		System.out.println("--------LANGUAGES--------");
		for(int i = 0; i < knownLangs.length; i++)
		{
			System.out.println(knownLangs[i]);
		}
	}
	
	public String[] getFinal()
	{
	    String[] fin = new String[knownLangs.length + 1];
	    fin[0] = System.lineSeparator() + "--------LANGUAGES--------";
	    
	    for(int i = 0; i < knownLangs.length; i++)
	    {
	        fin[i+1] = System.lineSeparator() + knownLangs[i];
	    }
	    
	    return fin;
	}
	
	public String[] getCodeFinal()
	{
	    String[] fin = new String[knownLangs.length + 1];
	    fin[0] = "--------LANGUAGES--------";
	    
	    for(int i = 0; i < knownLangs.length; i++)
	    {
	        fin[i+1] = "null" + knownLangs[i];
	    }
	    
	    return fin;
	}
}