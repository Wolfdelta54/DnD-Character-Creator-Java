import java.util.*;

public class RaceInfo
{
	private String speed;
	private String[] increasedScore;
	private int[] scoreIncreases;
	private String size;

	private Scanner wolf = new Scanner(System.in);

	public RaceInfo()
	{
	}

	public void setRaceInfo(String race, String subrace)
	{
		if(race.equalsIgnoreCase("Dragonborn"))
		{
			speed = "30ft";
			scoreIncreases = new int[2];
			increasedScore = new String[2];
			increasedScore[0] = "Strength";
			scoreIncreases[0] = 2;
			increasedScore[1] = "Charisma";
			scoreIncreases[1] = 1;
			size = "Medium";
		}
		else if(race.equalsIgnoreCase("Dwarf"))
		{
			speed = "25ft (Unaffected by heavy armor)";
			scoreIncreases = new int[2];
			increasedScore = new String[2];
			increasedScore[0] = "Constitution";
			scoreIncreases[0] = 2;
			if(subrace.equalsIgnoreCase("Hill"))
			{
				increasedScore[1] = "Wisdom";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Gray"))
			{
				increasedScore[1] = "Strength";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Mountain"))
			{
				speed = "20ft";
				increasedScore[1] = "Strength";
				scoreIncreases[1] = 2;
			}
			else
			{
				increasedScore[1] = "";
				scoreIncreases[1] = 0;
			}
			size = "Medium";
		}
		else if(race.equalsIgnoreCase("Elf"))
		{
			speed = "30ft";
			scoreIncreases = new int[2];
			increasedScore = new String[2];
			increasedScore[0] = "Dexterity";
			scoreIncreases[0] = 2;
			if(subrace.equalsIgnoreCase("High"))
			{
				increasedScore[1] = "Intelligence";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Dark"))
			{
				increasedScore[1] = "Charisma";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Wood"))
			{
				speed = "35ft";
				increasedScore[1] = "Wisdom";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Eladrin"))
			{
				increasedScore[1] = "Intelligence";
				scoreIncreases[1] = 1;
			}
			else
			{
				increasedScore[1] = "";
				scoreIncreases[1] = 0;
			}
			size = "Medium";
		}
		else if(race.equalsIgnoreCase("Gnome"))
		{
			speed = "25ft";
			scoreIncreases = new int[2];
			increasedScore = new String[2];
			increasedScore[0] = "Intelligence";
			scoreIncreases[0] = 2;
			if(subrace.equalsIgnoreCase("Forest"))
			{
				increasedScore[1] = "Dexterity";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Rock"))
			{
				increasedScore[1] = "Constitution";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Deep"))
			{
				increasedScore[1] = "Dexterity";
				scoreIncreases[1] = 1;
			}
			else
			{
				increasedScore[1] = "";
				scoreIncreases[1] = 0;
			}
			size = "Small";
		}
		else if(race.equalsIgnoreCase("Half-Elf"))
		{
			System.out.println("1. Constitution");
			System.out.println("2. Dexterity");
			System.out.println("3. Intelligence");
			System.out.println("4. Strength");
			System.out.println("5. Wisdom");

			System.out.print("\nChoose an ability to increase by 1 :: ");
			int ability1int = wolf.nextInt();
			String ability1 = "";

			if(ability1int == 1)
				ability1 = "Constitution";
			else if(ability1int == 2)
				ability1 = "Dexterity";
			else if(ability1int == 3)
				ability1 = "Intelligence";
			else if(ability1int == 4)
				ability1 = "Strength";
			else if(ability1int <= 5)
				ability1 = "Wisdom";

			System.out.print("\nChoose another ability to increase :: ");
			int ability2int = wolf.nextInt();
			String ability2 = "";

			if(ability2int == 1)
				ability2 = "Constitution";
			else if(ability2int == 2)
				ability2 = "Dexterity";
			else if(ability2int == 3)
				ability2 = "Intelligence";
			else if(ability2int == 4)
				ability2 = "Strength";
			else if(ability2int <= 5)
				ability1 = "Wisdom";

			speed = "30ft";
			scoreIncreases = new int[3];
			increasedScore = new String[3];
			increasedScore[0] = "Charisma";
			scoreIncreases[0] = 2;
			increasedScore[1] = ability1;
			scoreIncreases[1] = 1;
			increasedScore[1] = ability2;
			scoreIncreases[1] = 1;
			size = "Medium";
		}
		else if(race.equalsIgnoreCase("Half-Orc"))
		{
			speed = "30ft";
			scoreIncreases = new int[2];
			increasedScore = new String[2];
			increasedScore[0] = "Strength";
			scoreIncreases[0] = 2;
			increasedScore[1] = "Constitution";
			scoreIncreases[1] = 1;
			size = "Medium";
		}
		else if(race.equalsIgnoreCase("Halfling"))
		{
			speed = "25ft";
			scoreIncreases = new int[2];
			increasedScore = new String[2];
			increasedScore[0] = "Dexterity";
			scoreIncreases[0] = 2;
			if(subrace.equalsIgnoreCase("Ghostwise"))
			{
				increasedScore[1] = "Wisdom";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Lightfoot"))
			{
				increasedScore[1] = "Charisma";
				scoreIncreases[1] = 1;
			}
			else if(subrace.equalsIgnoreCase("Stout"))
			{
				increasedScore[1] = "Constitution";
				scoreIncreases[1] = 1;
			}
			else
			{
				increasedScore[1] = "";
				scoreIncreases[1] = 0;
			}
			size = "Small";
		}
		else if(race.equalsIgnoreCase("Human"))
		{
			speed = "30ft";
			scoreIncreases = new int[6];
			increasedScore = new String[6];
			increasedScore[0] = "Charisma";
			scoreIncreases[0] = 1;
			increasedScore[1] = "Constitution";
			scoreIncreases[1] = 1;
			increasedScore[0] = "Dexterity";
			scoreIncreases[0] = 1;
			increasedScore[1] = "Intelligence";
			scoreIncreases[1] = 1;
			increasedScore[0] = "Strength";
			scoreIncreases[0] = 1;
			increasedScore[1] = "Wisdom";
			scoreIncreases[1] = 1;
			size = "Medium";
		}
		else if(race.equalsIgnoreCase("Orc"))
		{
			speed = "30ft";
			scoreIncreases = new int[3];
			increasedScore = new String[3];
			increasedScore[0] = "Strength";
			scoreIncreases[0] = 2;
			increasedScore[1] = "Constitution";
			scoreIncreases[1] = 1;
			increasedScore[2] = "Intelligence";
			scoreIncreases[3] = -2;
			size = "Medium";
		}
		else if(race.equalsIgnoreCase("Tiefling"))
		{
			speed = "30ft";
			scoreIncreases = new int[2];
			increasedScore = new String[2];
			increasedScore[0] = "Charisma";
			scoreIncreases[0] = 2;
			increasedScore[1] = "Intelligence";
			scoreIncreases[1] = 1;
			size = "Medium";
		}
	}

	public String[] getIncreasedScores()
	{
		return increasedScore;
	}

	public int[] getScoreIncreases()
	{
		return scoreIncreases;
	}

	public void prntInfo()
	{
		System.out.println("Speed - " + speed);
		System.out.println("Size  - " + size);
	}
	
	public String[] getInfo()
	{
	    String[] fin = new String[2];
	    fin[0] = System.lineSeparator() + "Speed - " + speed;
	    fin[1] = System.lineSeparator() + "Size  - " + size;
	    
	    return fin;
	}
	
	public String[] getCodeInfo()
	{
	    String[] fin = new String[2];
	    fin[0] = "Speed - " + speed;
	    fin[1] = "Size  - " + size;
	    
	    return fin;
	}
}