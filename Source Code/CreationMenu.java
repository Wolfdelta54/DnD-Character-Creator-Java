import java.util.*;

public class CreationMenu 
{
	public static void main(String args[]) throws Exception
	{
		Scanner wolf = new Scanner(System.in);
		CharacterCreator create = new CharacterCreator();
		EditCharacter edit = new EditCharacter();
		LoadCharacter load = new LoadCharacter();
		MasterCharacter master = new MasterCharacter();
		
		boolean quit = false;
		
		System.out.println("Welcome to Darian Horn's Dungeons and Dragons Character Creator");
		System.out.println("This program provides the basic information that all new players will need");
		System.out.println("to create their own level 1 DnD characters while making the creation process");
		System.out.println("as easy to do as possible! Please enjoy using this program and feel free to");
		System.out.println("to contact me at darianlhorn@gmail.com with suggestions on what to change!");
		System.out.println("Please put DnDCharCreate in the topic bar of the email.");
		System.out.println();
		System.out.println("Note from the programmer :: ");
		System.out.println("This program was created by only 1 person and took several dozen hours");
		System.out.println("to create. If you find any bugs or errors contact me at *email* as I am");
		System.out.println("always going to be willing to fix them.");
		System.out.println();
		System.out.println();
		System.out.println();
		
		while(quit != true)
		{
			System.out.println();
			System.out.println();
    		System.out.println("Character Creation Options ::");
    		System.out.println();
    		System.out.println("1. Create a new character");
    		System.out.println("2. Edit an existing character");
    		System.out.println("3. View an existing character");
    		System.out.println("4. Quit the program");
    		System.out.println();
    		System.out.println();
    		System.out.print("Choose an option :: ");
    		int opt = wolf.nextInt();
    	
    		if(opt < 0 || (opt > 4 && opt < 54 ) || opt > 54)
    			opt = 4;
    	
    		if(opt != 54 && (opt <= 4 && opt >= 0))
    		{
    			if(opt <= 1)
    			{
    				create.characterCreation();
    				quit = create.getQuit();
    			}
    			else if(opt == 2)
    			{
    				edit.characterEdit();
    				quit = edit.getQuit();
    			}
    			else if(opt == 3)
    			{
    				load.characterLoad();
    				load.readFile();
    				quit = load.getQuit();
    			}
    			else
    			{
    				System.out.println();
    				System.out.println();
    				System.out.println("Thank you for using Darian Horn's Dungeons and Dragons");
    				System.out.println("character creator. Remember to contact me if you find any");
    				System.out.println("bugs or errors at darianlhorn@gmail.com and please share this program");
    				System.out.println("with your friends! Please put DnDCharCreate in the topic bar of the email.");
    				
    				quit = true;
    			}
    		}
    	
    		else if(opt == 54)
    		{
    			System.out.println();
    			System.out.println();
    			System.out.println("Congrats, you found a secret!");
    			System.out.println("But, do you know the code?");
    			System.out.println();
    			System.out.println();
    			System.out.print("Enter Code :: ");
    			String code = wolf.next();
    		
    			if(code.equals("wolfdelta"))
    			{
    				// creates an overpowered 1st level character named Tazlasar Nemphoth
    				// has 20's for every ability, a +5 mod to all skills, 3 enchanted weapons, enchanted arrows, and normal arrows
    				// everything else is basic Fighter starting equipment/spells/cantrips for 1st level
    				System.out.println();
    				System.out.println("Code Accepted");
    				System.out.println("Master Character Created");
    				System.out.println();
    				master.createMasterCharacter();
    			}
    			else if(code.equalsIgnoreCase("Mogar") || code.equalsIgnoreCase("Mogar Jones") || code.equalsIgnoreCase("Michael") || code.equalsIgnoreCase("Michael Jones") || code.equalsIgnoreCase("Jones"))
    			{
    				// creates Michael Jones's PC from Heroes and Halfwits, Mogar Jones
    				System.out.println();
    				System.out.println("Code Not Yet Implemented");
    				System.out.println("I apologize for the inconvenience");
    				System.out.println();
    			}
    			else if(code.equalsIgnoreCase("Albus") || code.equalsIgnoreCase("Albus Cumberbatch") || code.equalsIgnoreCase("Ryan") || code.equalsIgnoreCase("Ryan Haywood")  || code.equalsIgnoreCase("Haywood") || code.equalsIgnoreCase("Cumberbatch"))
    			{
    				// creates Ryan Haywood's PC from Heroes and Halfwits, Albus Cumberbatch
    				System.out.println();
    				System.out.println("Code Not Yet Implemented");
    				System.out.println("I apologize for the inconvenience");
    				System.out.println();
    			}
    			else if(code.equalsIgnoreCase("Bor") || code.equalsIgnoreCase("Bor Ealis") || code.equalsIgnoreCase("Gus") || code.equalsIgnoreCase("Gus Sorola") || code.equalsIgnoreCase("Sorola") || code.equalsIgnoreCase("Ealis"))
    			{
    				// creates Gus Sorola's PC from Heroes and Halfwits, Bor Ealis
    				System.out.println();
    				System.out.println("Code Not Yet Implemented");
    				System.out.println("I apologize for the inconvenience");
    				System.out.println();
    			}
    			else if(code.equalsIgnoreCase("Orma") || code.equalsIgnoreCase("Griffon") || code.equalsIgnoreCase("Griffon Ramsey"))
    			{
    				// creates Griffon Ramsey's PC from Heroes and Halfwits, Orma
    				System.out.println();
    				System.out.println("Code Not Yet Implemented");
    				System.out.println("I apologize for the inconvenience");
    				System.out.println();
    			}
    			else if(code.equalsIgnoreCase("Bo") || code.equalsIgnoreCase("Bo Jingles") || code.equalsIgnoreCase("Geoff") || code.equalsIgnoreCase("Geoff Ramsey"))
    			{
    				// creates Geoff Ramsey's PC from Heroes and Halfwits, Bo Jingles
    				System.out.println();
    				System.out.println("Code Not Yet Implemented");
    				System.out.println("I apologize for the inconvenience");
    				System.out.println();
    			}
    			else if(code.equalsIgnoreCase("Ramsey"))
    			{
    				// creates both Geoff and Griffon Ramsey's PCs, Bo Jingles and Orma, respectively
    				System.out.println();
    				System.out.println("Code Not Yet Implemented");
    				System.out.println("I apologize for the inconvenience");
    				System.out.println();
    			}
    		}
		}
    	
    	wolf.close();
	}
}
