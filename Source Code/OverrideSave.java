import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;

public class OverrideSave 
{
	private File fileToOverride;
	private String fileName;
	private Scanner wolf = new Scanner(System.in);
	private String[] saveInfoArray;
	private File usedNamesFile = new File("UsedNames.txt");
	private Scanner fileScan = new Scanner(usedNamesFile);
    private ArrayList<String> usedNames = new ArrayList<String>();
	private int copyNum = 0;
	
	public OverrideSave() throws Exception
	{
		this(new File("blank"));
	}
	
	public OverrideSave(File toOverride) throws Exception
	{
		setUsedNames();
		fileToOverride = toOverride;
		fileName = fileToOverride.getName().substring(0,fileToOverride.getName().indexOf("."));
		
		if(fileName.indexOf("_copy") != -1)
		{
			fileName = fileName.substring(0,fileName.indexOf("_copy"));
		}
	}
	
	private void setUsedNames()
	{
		while(fileScan.hasNextLine())
		{
			String temp = fileScan.nextLine();
			usedNames.add(temp);
		}
	}
	
	private void saveOver() throws Exception
	{
		System.out.println();
		System.out.println();
		System.out.print("Continue with over-ride (y/n) :: ");
		String cont = wolf.next();
		
		if(cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("continue"))
		{
			System.out.println();
			System.out.println();
			System.out.print("To continue with the over-ride please enter :: \"CONFIRM OVER-RIDE\"");
			System.out.println("!!!! Input IS case-sensitive !!!!");
    		System.out.println();
    		System.out.println();
    		System.out.print("Input :: ");
    		String input = wolf.nextLine();
    		
    		if(input.equals("CONFIRM OVER-RIDE"))
    		{
    			try {
    				Files.deleteIfExists(Paths.get(fileName + ".txt"));
    			}
    			catch (NoSuchFileException e) {
    				System.out.println("No such character file exists exists");
    			}
    			catch (DirectoryNotEmptyException e) {
    				System.out.println("Directory is not empty");
    			}
    			catch (IOException e) {
    				System.out.println("Invalid permissions");
    			}
		
    			File f = new File(fileName + ".txt");
    			FileWriter fw = new FileWriter(f);
    			PrintWriter pw = new PrintWriter(fw);
    			
    			for(int i = 0; i < saveInfoArray.length; i++)
    			{
    				String temp = saveInfoArray[i];
    				temp = temp.replaceAll("\n",  "null");
        	
    				if(temp.indexOf("null") == -1)
    					pw.println(saveInfoArray[i]);
    				else
    				{
    					while(temp.indexOf("null") != -1)
    					{
    						String temp2 = temp.substring(0, temp.indexOf("null"));
    						pw.println(temp2);
    						temp = temp.substring(temp.indexOf("null") + 4);
    					}
    					pw.println(temp);
    				}
    			}
        	
    			pw.flush();
    			fw.close();
    			pw.close();
        
    			f.setReadable(true);
    		}
    		else
    		{
        		System.out.println();
        		System.out.println("Character file over-ride has been cancelled");
        		System.out.println("Ending program");
    		}
    	}
		else
		{
    		System.out.println();
    		System.out.println("Character file over-ride has been cancelled");
    		System.out.println("Ending program");
		}
	}
	
	private void saveCopy() throws Exception
	{
		String tempName = fileName + "_copy";
		for(int i = 0; i < usedNames.size();i ++)
		{
			tempName = fileName + "_copy" + copyNum;
			if(usedNames.contains(tempName))
				copyNum++;
		}
		fileName = tempName;
        
        try
        {
            final Path path = Paths.get("UsedNames.txt");
            Files.write(path, Arrays.asList(fileName), StandardCharsets.UTF_8,
                Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        }
        catch (final IOException ioe)
        {
        }
		
        File f = new File(fileName + ".txt");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        
        for(int i = 0; i < saveInfoArray.length; i++)
        {
        	String temp = saveInfoArray[i];
        	
        	if(temp.indexOf("\n") != -1)
        		temp = temp.replaceAll("\n",  "null");
        	
        	if(temp.indexOf("null") == -1)
        		pw.println(saveInfoArray[i]);
        	else
        	{
        		while(temp.indexOf("null") != -1)
        		{
        			String temp2 = temp.substring(0, temp.indexOf("null"));
        			pw.println(temp2);
        			temp = temp.substring(temp.indexOf("null") + 4);
        		}
        		pw.println(temp);
        	}
        }
        pw.flush();
        fw.close();
        pw.close();
        
        f.setReadable(true);
	}
	
	private void setSaveInfo(String[] contents)
	{
		saveInfoArray = contents;
	}
	
	public void saveOptions(String[] contents) throws Exception
	{
		setSaveInfo(contents);
		String saveOutput = "";
		System.out.println();
		System.out.println("1. Override the Current saved file");
		System.out.println("2. Save as a new copy of the old file");
		System.out.print("\nChoose a Save Option from Above :: ");
		int saveOpt = wolf.nextInt();
		
		if(saveOpt >= 2)
		{
			saveCopy();
			saveOutput = "+++++++ Copy  Saved +++++++";
		}
		else
		{
			saveOver();
			saveOutput = "++++ Override Complete ++++";
		}
		
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++");
		System.out.println(saveOutput);
        System.out.println("+++++++++++++++++++++++++++");
	}
}
