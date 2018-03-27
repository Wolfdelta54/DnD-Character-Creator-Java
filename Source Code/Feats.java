public class Feats
{
	private String className;
	private String[] classFeats;
	private String[] raceFeats;

	public Feats()
	{
	}

	public void setClass(String name)
	{
		className = name;
		setClassFeats();
		raceFeats = new String[0];
	}

	private void setClassFeats()
	{
		if(className.equalsIgnoreCase("Rogue"))
		{
			classFeats = new String[3];

			classFeats[0] = "Expertise";
			classFeats[1] = "Sneak Attack";
			classFeats[2] = "Thieves' Cant (You know the secret language of thieves)";
		}
		else
		{
			classFeats = new String[2];

			if(className.equalsIgnoreCase("Barbarian"))
			{
				classFeats[0] = "Rage";
				classFeats[1] = "Unarmored Defense";
			}
			else if(className.equalsIgnoreCase("Bard"))
			{
				classFeats[0] = "Spellcasting";
				classFeats[1] = "Bardic Inspiration (d6)";
			}
			else if(className.equalsIgnoreCase("Cleric"))
			{
				classFeats[0] = "Spellcasting";
				classFeats[1] = "Choose"; //Divine Domain
			}
			else if(className.equalsIgnoreCase("Druid"))
			{
				classFeats[0] = "Druidic";
				classFeats[1] = "Spellcasting";
			}
			else if(className.equalsIgnoreCase("Fighter"))
			{
				classFeats[0] = "Choose"; //Fighting Style
				classFeats[1] = "Second Wind";
			}
			else if(className.equalsIgnoreCase("Monk"))
			{
				classFeats[0] = "Unarmored Defense";
				classFeats[1] = "Martial Arts";
			}
			else if(className.equalsIgnoreCase("Paladin"))
			{
				classFeats[0] = "Divine Sense";
				classFeats[1] = "Lay on Hands (Healing Touch)";
			}
			else if(className.equalsIgnoreCase("Ranger"))
			{
				classFeats[0] = "Choose"; //Favored Enemy
				classFeats[1] = "Natural Explorer";
			}
			else if(className.equalsIgnoreCase("Sorcerer"))
			{
				classFeats[0] = "Spellcasting";
				classFeats[1] = "Choose"; //Sorcerous Origin
			}
			else if(className.equalsIgnoreCase("Warlock"))
			{
				classFeats[0] = "Choose"; //Other Worldly Patron
				classFeats[1] = "Pact Magic";
			}
			else if(className.equalsIgnoreCase("Wizard"))
			{
				classFeats[0] = "Spellcasting";
				classFeats[1] = "Arcane Recovery";
			}
		}
	}

	public void setChooseSlot(String special)
	{
		for(int i = 0; i < classFeats.length; i++)
		{
			if(classFeats[i].equalsIgnoreCase("Choose"))
			{
				classFeats[i] = special;
			}
			else
			{
				@SuppressWarnings("unused")
				int blank = 0;
			}
		}
	}

	public void prntFinal()
	{
		System.out.println("--------FEATS--------");
		System.out.println("   --Class Feats--");
		for(int i = 0; i < classFeats.length; i++)
		{
			System.out.println(classFeats[i]);
		}
		System.out.println();
		System.out.println("   --Race  Feats--");
		for(int i = 0; i < raceFeats.length; i++)
		{
			System.out.println(raceFeats[i]);
		}
	}
	
	public String[] getFinal()
	{
	    int totalLen = classFeats.length + raceFeats.length;
	    String[] fin = new String[totalLen + 4];
	    int curSlot = 2;
	    fin[0] = System.lineSeparator() + "--------FEATS--------";
	    fin[1] = System.lineSeparator() + "   --Class Feats--";
	    for(int i = 0; i < classFeats.length; i++)
	    {
	        fin[i+1] = System.lineSeparator() + classFeats[i];
	        curSlot++;
	    }
	    fin[curSlot] = System.lineSeparator() + "";
	    curSlot++;
	    fin[curSlot] = System.lineSeparator() + "   --Race  Feats--";
	    curSlot++;
	    for(int i = 0; i < raceFeats.length; i++)
	    {
	        fin[curSlot] = System.lineSeparator() + raceFeats[i];
	        curSlot++;
	    }
	    
	    return fin;
	}
	
	public String[] getCodeFinal()
	{
	    int totalLen = classFeats.length + raceFeats.length;
	    String[] fin = new String[totalLen + 3];
	    int curSlot = 2;
	    fin[0] = "--------FEATS--------";
	    fin[1] = "   --Class Feats--";
	    for(int i = 0; i < classFeats.length; i++)
	    {
	        fin[i+1] ="null" + classFeats[i];
	        curSlot++;
	    }
	    fin[curSlot] = "null   --Race  Feats--";
	    curSlot++;
	    for(int i = 0; i < raceFeats.length; i++)
	    {
	        fin[curSlot] = "null" + raceFeats[i];
	        curSlot++;
	    }
	    
	    return fin;
	}

	public void addRaceFeats(String[] addRaceFeats)
	{
		raceFeats = addRaceFeats;
	}
}