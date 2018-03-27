public class FightStyle
{
	private String[] styleList;
	private String styleChosen;

	public FightStyle()
	{
		setUpList();
	}

	public void list()
	{
		System.out.println("1. Archery - +2 to ranged attack rolls");
		System.out.println("2. Defense - +1 AC when wearing armor");
		System.out.println("3. Dueling - +2 to damage rolls when weilding one one-handed weapon");
		System.out.println("4. Great Weapon Fighting - when weilding a weapon with two-hands you may reroll a 1 or 2, keep result regardless");
		System.out.println("5. Protection - when weilding a shield and when someone within 5ft of you is attacked, you may impose disadvantage on the a the attack roll");
		System.out.println("6. Two Weapon Fighting - when you are holding 2 different light melee weapons and attack with one you can use a bonus action to attack with the other, ability mod does not apply to second attack");
	}

	private void setUpList()
	{
		styleList = new String[6];
		styleList[0] = "Archery";
		styleList[1] = "Defense";
		styleList[2] = "Dueling";
		styleList[3] = "Great Weapon Fighting";
		styleList[4] = "Protection";
		styleList[5] = "Two Weapon Fighting";
	}

	public void setChoice(int choice)
	{
		styleChosen = styleList[choice];
	}

	public String getChoice()
	{
		return styleChosen;
	}
}