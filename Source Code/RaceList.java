import java.util.*;

public class RaceList
{
	private String[] races;
	private String raceName;
	private Scanner wolf = new Scanner(System.in);
	private String[] subs;
	private String subRace;

	public RaceList()
	{
		races = new String[10];

		races[0] = "Dragonborn";
		races[1] = "Dwarf";
		races[2] = "Elf";
		races[3] = "Gnome";
		races[4] = "Half-Elf";
		races[5] = "Half-Orc";
		races[6] = "Halfling";
		races[7] = "Human";
		races[8] = "Tiefling";
		races[9] = "Orc";
	}

	public void prnt()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println((i + 1) + ". " + races[i]);
		}
		System.out.print("\nChoose a race :: ");
		int slot = wolf.nextInt() - 1;
		setRaceName(slot);
	}

	public void setRaceName(int index)
	{
		raceName = races[index];
		setSubs();
	}

	public void setSubRaceName(int index)
	{
		subRace = subs[index];
	}

	public String getRaceName()
	{
		return raceName;
	}

	public String getSubRace()
	{
		return subRace;
	}

	public void setSubs()
	{
		if(raceName.equalsIgnoreCase("Dragonborn"))
		{
			subs = new String[10];
			subs[0] = "Black";
			subs[1] = "Blue";
			subs[2] = "Brass";
			subs[3] = "Bronze";
			subs[4] = "Copper";
			subs[5] = "Gold";
			subs[6] = "Green";
			subs[7] = "Red";
			subs[8] = "Silver";
			subs[9] = "White";
		}
		else if(raceName.equalsIgnoreCase("Dwarf"))
		{
			subs = new String[4];
			subs[0] = "Hill";
			subs[1] = "Mountain";
			subs[2] = "Gray";
			subs[3] = "Regular";
		}
		else if(raceName.equalsIgnoreCase("Elf"))
		{
			subs = new String[5];
			subs[0] = "High";
			subs[1] = "Dark";
			subs[2] = "Wood";
			subs[3] = "Eladrin";
			subs[4] = "Regular";
		}
		else if(raceName.equalsIgnoreCase("Gnome"))
		{
			subs = new String[4];
			subs[0] = "Rock";
			subs[1] = "Deep";
			subs[2] = "Forest";
			subs[3] = "Regular";
		}
		else if(raceName.equalsIgnoreCase("Half-Elf"))
		{
			subs = new String[1];
			subs[0] = "Half-Elf";
		}
		else if(raceName.equalsIgnoreCase("Half-Orc"))
		{
			subs = new String[1];
			subs[0] = "Half-Orc";
		}
		else if(raceName.equalsIgnoreCase("Halfling"))
		{
			subs = new String[4];
			subs[0] = "Stout";
			subs[1] = "Lightfoot";
			subs[2] = "Ghostwise";
			subs[3] = "Regular";
		}
		else if(raceName.equalsIgnoreCase("Human"))
		{
			subs = new String[1];
			subs[0] = "Human";
		}
		else if(raceName.equalsIgnoreCase("Tiefling"))
		{
			subs = new String[1];
			subs[0] = "Tiefling";
		}
		else if(raceName.equalsIgnoreCase("Orc"))
		{
			subs = new String[1];
			subs[0] = "No subrace";
		}
		else
		{
			subs = new String[1];
			subs[0] = "Sub Already Chosen";
		}
	}

	public void prntSubRaceList()
	{
		for(int i = 0; i < subs.length; i++)
		{
			System.out.println((i + 1) + ". " + subs[i] + " " + raceName);
		}
		System.out.print("\nChoose a sub-race :: ");
		int slot = wolf.nextInt() - 1;
		setSubRaceName(slot);
	}
}