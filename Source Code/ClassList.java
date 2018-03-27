import java.util.*;

public class ClassList
{
	private String[] classes;
	private String className;
	private Scanner wolf = new Scanner(System.in);

	public ClassList()
	{
		classes = new String[12];

		classes[0] = "Barbarian (str)";
		classes[1] = "Bard (cha)";
		classes[2] = "Cleric (wis)";
		classes[3] = "Druid (wis)";
		classes[4] = "Fighter (str or dex)";
		classes[5] = "Monk (dex & wis)";
		classes[6] = "Paladin (str & cha)";
		classes[7] = "Ranger (dex & wis)";
		classes[8] = "Rogue (dex & int)";
		classes[9] = "Sorcerer (cha)";
		classes[10] = "Warlock (cha)";
		classes[11] = "Wizard (int)";
	}

	public void prnt()
	{
		System.out.println("Class information");
		System.out.println("Class Name (Primary ability, assign highest roll to this ability for max efficiency)");
		System.out.println();
		for(int i = 0; i < 12; i++)
		{
			System.out.println((i + 1) + ". " + classes[i]);
		}
		System.out.print("\nChoose a class :: ");
		int slot = wolf.nextInt() - 1;
		setClassName(slot);
	}

	public void setClassName(int index)
	{
		if(index < 0)
			index = 0;
		else if(index >= classes.length)
			index = classes.length - 1;
		
		className = classes[index];
	}

	public String getClassName()
	{
		String output = className;
		
		output = output.substring(0, output.indexOf(" "));
		return output;
	}
}