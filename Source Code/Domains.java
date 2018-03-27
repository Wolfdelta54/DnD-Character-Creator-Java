public class Domains
{
	private String[] domainList;
	private String domainChosen;

	public Domains()
	{
	}

	public void list()
	{
		System.out.println("1. Arcana Domain");
		System.out.println("2. Knowledge Domain");
		System.out.println("3. Life Domain");
		System.out.println("4. Light Domain");
		System.out.println("5. Nature Domain");
		System.out.println("6. Tempest Domain");
		System.out.println("7. Trickery Domain");
		System.out.println("8. War Domain");
		setUpList();
	}

	private void setUpList()
	{
		domainList = new String[8];
		domainList[0] = "Arcana";
		domainList[1] = "Knowledge";
		domainList[2] = "Life";
		domainList[3] = "Light";
		domainList[4] = "Nature";
		domainList[5] = "Tempest";
		domainList[6] = "Trickery";
		domainList[7] = "War";
	}

	public void setChoice(int choice)
	{
		domainChosen = domainList[choice];
	}

	public String getChoice()
	{
		return "Divine Domain - " + domainChosen;
	}
}