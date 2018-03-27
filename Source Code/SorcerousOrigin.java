public class SorcerousOrigin
{
	private String[] originList;
	private String[] dragonList;
	private String originChosen;

	public SorcerousOrigin()
	{
	}

	public void list()
	{
		System.out.println("1. Draconic Bloodline");
		System.out.println("2. Wild Magic");
		setUpList();
	}

	private void setUpList()
	{
		originList = new String[2];
		originList[0] = "Draconic Bloodline";
		originList[1] = "Wild Magic";

		dragonList = new String[10];
		dragonList[0] = "Black";
		dragonList[1] = "Blue";
		dragonList[2] = "Brass";
		dragonList[3] = "Bronze";
		dragonList[4] = "Copper";
		dragonList[5] = "Gold";
		dragonList[6] = "Green";
		dragonList[7] = "Red";
		dragonList[8] = "Silver";
		dragonList[9] = "White";
	}

	public void setChoice(int choice)
	{
		originChosen = originList[choice];
	}

	public void listDragon()
	{
		if(originChosen.equalsIgnoreCase("Draconic Bloodline"))
		{
			System.out.println("Type refers to what type of damage you are resistant to, so choose wisely");
			System.out.println("Coloration 		- Type");
			System.out.println("1.  Black		- Acid");
			System.out.println("2.  Blue		- Lightning");
			System.out.println("3.  Brass		- Fire");
			System.out.println("4.  Bronze		- Lightning");
			System.out.println("5.  Copper		- Acid");
			System.out.println("6.  Gold		- Fire");
			System.out.println("7.  Green		- Poison");
			System.out.println("8.  Red			- Fire");
			System.out.println("9.  Silver		- Cold");
			System.out.println("10. White		- Cold");
		}
		else
		{
			System.out.println("Press 1 and then press enter to continue");
		}
	}

	public void setDragon(int index)
	{
		if(originChosen.equalsIgnoreCase("Draconic Bloodline"))
			originChosen = originChosen + " - " + dragonList[index];
	}

	public String getChoice()
	{
		return originChosen;
	}
}