public class HPGen
{
	private String hitDie;
	private int finalHP;
	private int startHP;

	public HPGen()
	{
	}

	public void setHP(String name, int con)
	{
		setMax(name);
		finalHP = startHP + con;
	}

	private void setMax(String name)
	{
		if(name.equalsIgnoreCase("Barbarian"))
		{
			hitDie = "1d12";
			startHP = 12;
		}
		else if(name.equalsIgnoreCase("Fighter") || name.equalsIgnoreCase("Paladin") || name.equalsIgnoreCase("Ranger"))
		{
			hitDie = "1d10";
			startHP = 10;
		}
		else if(name.equalsIgnoreCase("Sorcerer") || name.equalsIgnoreCase("Wizard"))
		{
			hitDie = "1d6";
			startHP = 6;
		}
		else
		{
			hitDie = "1d8";
			startHP = 8;
		}
	}

	public String getHP()
	{
		return "Hit Points :: " + finalHP + "\nHit Die :: " + hitDie;
	}

	public void prntHP()
	{
		System.out.println(getHP());
	}
	
	public String[] getFinal()
	{
	    String[] fin = new String[2];
	    fin[0] = System.lineSeparator() + "Hit Points :: " + finalHP;
	    fin[1] = System.lineSeparator() + "Hit Die    :: " + hitDie;
	    
	    return fin;
	}
	
	public String[] getFinal2()
	{
	    String[] fin = new String[1];
	    fin[0] = "Hit Points :: " + finalHP;
	    
	    return fin;
	}
	
	public String[] getCodeFinal()
	{
	    String[] fin = new String[2];
	    fin[0] = "Hit Points :: " + finalHP;
	    fin[1] = "Hit Die	 :: " + hitDie;
	    
	    return fin;
	}
}