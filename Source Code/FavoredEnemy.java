public class FavoredEnemy
{
	private String[] enemyList;
	private String[] humanoidList;
	private String enemyChosen;

	public FavoredEnemy()
	{
	}

	public void list()
	{
		System.out.println("1.  Aberrations");
		System.out.println("2.  Beasts");
		System.out.println("3.  Celestials");
		System.out.println("4.  Constructs");
		System.out.println("5.  Dragons");
		System.out.println("6.  Elementals");
		System.out.println("7.  Fey");
		System.out.println("8.  Fiends");
		System.out.println("9.  Giants");
		System.out.println("10. Monstrosities");
		System.out.println("11. Oozes");
		System.out.println("12. Plants");
		System.out.println("13. Undead");
		System.out.println("14. Two Humanoids");
		setUpList();
	}

	private void setUpList()
	{
		enemyList = new String[14];
		enemyList[0] = "Aberrations";
		enemyList[1] = "Beasts";
		enemyList[2] = "Celestials";
		enemyList[3] = "Constructs";
		enemyList[4] = "Dragons";
		enemyList[5] = "Elementals";
		enemyList[6] = "Fey";
		enemyList[7] = "Fiends";
		enemyList[8] = "Giants";
		enemyList[9] = "Monstrosities";
		enemyList[10] = "Oozes";
		enemyList[11] = "Plants";
		enemyList[12] = "Undead";
		enemyList[13] = "Two Humanoids";

		humanoidList = new String[45];
		humanoidList[0] = "Aasimar";
		humanoidList[1] = "Bugbear";
		humanoidList[2] = "Bullywug";
		humanoidList[3] = "Catfolk";
		humanoidList[4] = "Darfellan";
		humanoidList[5] = "Dark One";
		humanoidList[6] = "DragonBorn";
		humanoidList[7] = "Drow";
		humanoidList[8] = "Dwarf";
		humanoidList[9] = "Eladrin";
		humanoidList[10] = "Elf";
		humanoidList[11] = "Genasi";
		humanoidList[12] = "Gibberling";
		humanoidList[13] = "Githyanki";
		humanoidList[14] = "Githzerai";
		humanoidList[15] = "Gnoll";
		humanoidList[16] = "Gnome";
		humanoidList[17] = "Goblin";
		humanoidList[18] = "Goliath";
		humanoidList[19] = "Grippli";
		humanoidList[20] = "Helf-Elf";
		humanoidList[21] = "Half-Orc";
		humanoidList[22] = "Halfling";
		humanoidList[23] = "Hobgoblin";
		humanoidList[24] = "Human";
		humanoidList[25] = "Kenku";
		humanoidList[26] = "Kobold";
		humanoidList[27] = "Lizardfolk";
		humanoidList[28] = "Locathah";
		humanoidList[29] = "Merfolk";
		humanoidList[30] = "Mongrefolk";
		humanoidList[31] = "Mul";
		humanoidList[32] = "Nilbog";
		humanoidList[33] = "Norker";
		humanoidList[34] = "Orc";
		humanoidList[35] = "Orog";
		humanoidList[36] = "Rakasta";
		humanoidList[37] = "Saurial";
		humanoidList[38] = "Selkie";
		humanoidList[39] = "Shifter";
		humanoidList[40] = "Skulk";
		humanoidList[41] = "Swanmay";
		humanoidList[42] = "Tasloi";
		humanoidList[43] = "Tiefling";
		humanoidList[44] = "Troglodyte";
	}

	public void setChoice(int choice)
	{
		enemyChosen = enemyList[choice];
	}

	public void listHumanoids()
	{
		if(enemyChosen.equalsIgnoreCase("Two Humanoids"))
		{
			for(int i = 0; i < humanoidList.length; i++)
			{
				System.out.println((i + 1) + ". " + humanoidList[i]);
			}
		}
		else
			System.out.println("Press 1 and then press enter to continue");
	}

	public void setHumanoid(int index1, int index2)
	{
		if(enemyChosen.equalsIgnoreCase("Two Humanoids"))
			enemyChosen = enemyChosen + " - " + humanoidList[index1] + " and " + humanoidList[index2];
	}

	public String getChoice()
	{
		return enemyChosen;
	}
}