import java.util.*;

public class SpecialFeats
{
	private Scanner wolf = new Scanner(System.in);
	private String className;
	private Domains cleric = new Domains();
	private FightStyle fighter = new FightStyle();
	private FavoredEnemy ranger = new FavoredEnemy();
	private SorcerousOrigin sorcerer = new SorcerousOrigin();
	private OWPatron warlock = new OWPatron();

	public SpecialFeats()
	{
	}

	public void setClass(String name)
	{
		className = name;
	}

	public void list()
	{
		if(className.equalsIgnoreCase("Cleric"))
		{
			System.out.println();
			cleric.list();
			System.out.print("\nChoose a domain :: ");
			int dom = wolf.nextInt() - 1;
			setChoice(dom);
		}
		else if(className.equalsIgnoreCase("Fighter"))
		{
			System.out.println();
			fighter.list();
			System.out.print("\nChoose a fighting style :: ");
			int style = wolf.nextInt() - 1;
			setChoice(style);
		}
		else if(className.equalsIgnoreCase("Ranger"))
		{
			System.out.println();
			ranger.list();
			System.out.print("\nChoose an enemy type :: ");
			int enem = wolf.nextInt() - 1;
			setChoice(enem);
			if(enem == 13)
				prntList2();
		}
		else if(className.equalsIgnoreCase("Sorcerer"))
		{
			System.out.println();
			sorcerer.list();
			System.out.print("\nChoose a sorcerous origin :: ");
			int origin = wolf.nextInt() - 1;
			setChoice(origin);
			if(origin == 0)
				prntList2();
		}
		else if(className.equalsIgnoreCase("Warlock"))
		{
			System.out.println();
			warlock.list();
			System.out.print("\nChoose an Otherworldly Patron :: ");
			int patron = wolf.nextInt() - 1;
			setChoice(patron);
		}
		else
		{
			System.out.println();
		}
	}

	public void setChoice(int num)
	{
		if(className.equalsIgnoreCase("Cleric"))
		{
			cleric.setChoice(num);
		}
		else if(className.equalsIgnoreCase("Fighter"))
		{
			fighter.setChoice(num);
		}
		else if(className.equalsIgnoreCase("Ranger"))
		{
			ranger.setChoice(num);
		}
		else if(className.equalsIgnoreCase("Sorcerer"))
		{
			sorcerer.setChoice(num);
		}
		else if(className.equalsIgnoreCase("Warlock"))
		{
			warlock.setChoice(num);
		}
		else
		{
			@SuppressWarnings("unused")
			int i = 0;
		}
	}

	private String getChoice()
	{
		if(className.equalsIgnoreCase("Cleric"))
		{
			return cleric.getChoice();
		}
		else if(className.equalsIgnoreCase("Fighter"))
		{
			return fighter.getChoice();
		}
		else if(className.equalsIgnoreCase("Ranger"))
		{
			return ranger.getChoice();
		}
		else if(className.equalsIgnoreCase("Sorcerer"))
		{
			return sorcerer.getChoice();
		}
		else if(className.equalsIgnoreCase("Warlock"))
		{
			return warlock.getChoice();
		}
		else
		{
			return "";
		}
	}

	private void prntList2()
	{
		if(className.equalsIgnoreCase("Ranger"))
		{
			ranger.listHumanoids();
			System.out.print("\nChoose a humanoid :: ");
			int humanoid1 = wolf.nextInt() - 1;
			System.out.print("Choose another humanoid :: ");
			int humanoid2 = wolf.nextInt() - 1;
			ranger.setHumanoid(humanoid1, humanoid2);
		}
		else if(className.equalsIgnoreCase("Sorcerer"))
		{
			sorcerer.listDragon();
			System.out.print("\nChoose a dragonic bloodline :: ");
			int dragon = wolf.nextInt() - 1;
			sorcerer.setDragon(dragon);
		}
		else
		{
		}
	}

	public String[] addSpells()
	{
		if(className.equalsIgnoreCase("Warlock"))
		{
			return warlock.addSpells();
		}
		else
		{
			String[] empty = new String[0];
			return empty;
		}
	}

	public String getFinal()
	{
		String fin = getChoice();
		return fin;
	}
}