public class OWPatron
{
	private String[] patronList;
	private String patronChosen;

	public OWPatron()
	{
	}

	public void list()
	{
		System.out.println("1. The Archfey");
		System.out.println("2. The Celestial");
		System.out.println("3. The Fiend");
		System.out.println("4. The Great Old One");
		System.out.println("5. The Hexblade");
		System.out.println("6. The Raven Queen");
		System.out.println("7. The Seeker");
		setUpList();
	}

	public String[] addSpells()
	{
		String[] update = new String[2];

		if(patronChosen.equalsIgnoreCase("The Archfey"))
		{
			update[0] = "Faerie fire";
			update[1] = "Sleep";
		}
		else if(patronChosen.equalsIgnoreCase("The Fiend"))
		{
			update[0] = "Burning hands";
			update[1] = "Command";
		}
		else if(patronChosen.equalsIgnoreCase("The Great Old One"))
		{
			update[0] = "Dissonant whispers";
			update[1] = "Tasha's hideous laughter";
		}
		else if(patronChosen.equalsIgnoreCase("The Hexblade"))
		{
			update[0] = "Shield";
			update[1] = "Wrathful smite";
		}
		else if(patronChosen.equalsIgnoreCase("The Raven Queen"))
		{
			update[0] = "False life";
			update[1] = "Sanctuary";
		}
		else if(patronChosen.equalsIgnoreCase("The Seeker"))
		{
			update[0] = "Feather fall";
			update[1] = "Jump";
		}
		else if(patronChosen.equalsIgnoreCase("The Celestial"))
		{
			update[0] = "Burning hands";
			update[1] = "Cure wounds";
		}
		return update;
	}

	public String getBonus()
	{
		if(patronChosen.equalsIgnoreCase("The Archfey"))
		{
			return "Fey Presence";
		}
		else if(patronChosen.equalsIgnoreCase("The Fiend"))
		{
			return "Dark One's Blessing";
		}
		else if(patronChosen.equalsIgnoreCase("The Great Old One"))
		{
			return "Awakened Mind";
		}
		else if(patronChosen.equalsIgnoreCase("The Hexblade"))
		{
			return "Hex Warrior, Hexblade's Curse";
		}
		else if(patronChosen.equalsIgnoreCase("The Raven Queen"))
		{
			return "Sentinel Raven";
		}
		else if(patronChosen.equalsIgnoreCase("The Seeker"))
		{
			return "Shielding Aurora";
		}
		else if(patronChosen.equalsIgnoreCase("The Celestial"))
		{
			return "Bonus Cantrips (gain the Sacred flame and light cantrips, they do not count against you), Healing Light";
		}
		else
		{
			return "How da heck?!";
		}
	}

	private void setUpList()
	{
		patronList = new String[7];
		patronList[0] = "The Archfey";
		patronList[1] = "The Celestial";
		patronList[2] = "The Fiend";
		patronList[3] = "The Great Old One";
		patronList[4] = "The Hexblade";
		patronList[5] = "The Raven Queen";
		patronList[6] = "The Seeker";
	}

	public void setChoice(int choice)
	{
		patronChosen = patronList[choice];
	}

	public String getChoice()
	{
		return patronChosen + " - " + getBonus();
	}
}