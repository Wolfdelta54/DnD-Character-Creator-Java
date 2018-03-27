import java.io.*;
import java.util.*;

public class LoadCharacter
{
    private Scanner wolf = new Scanner(System.in);
    private File usedNames = new File("UsedNames.txt");
    private Scanner charFiles;
        
    private int chosenCharFile = 0;
    private File chosenFile;
    
    private boolean quit;
    
    public LoadCharacter()
    {
    	quit = false;
    }
    
    public void characterLoad() throws Exception
    {
        int num = 1;
        charFiles = new Scanner(usedNames);
        while(charFiles.hasNextLine())
        {
            System.out.println(num + ". " + charFiles.nextLine());
            num++;
        }
        charFiles.close();
        
        System.out.print("Choose a character sheet to load :: ");
        chosenCharFile = wolf.nextInt() - 1;
        load();

        System.out.println();
        System.out.println();
        System.out.println("The character loading process has ended");
        System.out.println("You may -");
        System.out.println();
        System.out.println("1. Return to main menu");
        System.out.println("2. Quit the program");
        System.out.println();
        System.out.print("\nWhat would you like to do :: ");
        int qOrC = wolf.nextInt();
        
        if(qOrC <= 1)
        	quit = true;
        
        else
        	quit = false;
        
        wolf.close();
    }
    
    private void load() throws Exception
    {
        setFile(chosenCharFile);
    }
    
    private void setFile(int num) throws Exception
    {
    	Scanner scan = new Scanner(usedNames);
    	int curLine = 0;
    	
    	while(scan.hasNextLine())
    	{
    		String tempStorage = scan.nextLine() + ".txt";
    		if(curLine == num)
    			chosenFile = new File(tempStorage);
    		
    		curLine++;
    	}
    	scan.close();
    }
    
    public void readFile() throws Exception
    {
        Scanner temp = new Scanner(chosenFile);
        while(temp.hasNextLine())
        {
            System.out.println(temp.nextLine());
        }
        temp.close();
    }
    
    public File getFile()
    {
        return chosenFile;
    }
    
 /*   public static void main(String args[]) throws Exception
    {
        LoadCharacter loadChar = new LoadCharacter();
    } */
    
    public boolean getQuit()
    {
    	return quit;
    }
}