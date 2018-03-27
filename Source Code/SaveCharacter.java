import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;

public class SaveCharacter
{
    private String characterInfo;
    private String saveName;
    private String[] codeInfo;
    private char ans;
    
    private Scanner wolf = new Scanner(System.in);
    private Scanner used;
    private ArrayList<String> usedNames = new ArrayList<String>();
    
    public SaveCharacter() throws Exception
    {
        used = new Scanner(new File("UsedNames.txt"));
        
        while (used.hasNextLine())
        {
            usedNames.add(used.nextLine());
        }
        used.close();
    }
    
    public void saveOption()
    {
        System.out.println();
        System.out.println("Would you like to save a txt document containing this information? (y/n)");
        System.out.print("\nAnswer :: ");
        ans = wolf.next().charAt(0);
        
        @SuppressWarnings("unused")
		int x;
        
        if(ans == 'y' || ans == 'Y')
            setSave();
        else
            x = 0;
    }
    
    public char getChoice()
    {
        return ans;
    }
    
    public void setSave()
    {
        boolean isUsed = true;
        String characterName = "";
        
        while(isUsed == true)
        {
            System.out.println();
            System.out.println("Name Your Character :: ");
            characterName = wolf.next();
            isUsed = usedNames.contains(characterName);
        }
        
        saveName = characterName + ".txt";
        
        try
        {
            final Path path = Paths.get("UsedNames.txt");
            Files.write(path, Arrays.asList(characterName), StandardCharsets.UTF_8,
                Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        }
        catch (final IOException ioe)
        {
        }
    }
    
    public void setMasterSave()
    {
        String characterName = "Tazlasar Nemphoth(Master Character)";
        
        saveName = characterName + ".txt";
        
        try
        {
            final Path path = Paths.get("UsedNames.txt");
            Files.write(path, Arrays.asList(characterName), StandardCharsets.UTF_8,
                Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        }
        catch (final IOException ioe)
        {
        }
    }
    
    public void setSaveInfo(String[] infoToSave, int len)
    {
        characterInfo = infoToSave[0];
        
        for(int i = 1; i < len; i++)
        {
            characterInfo = characterInfo + System.lineSeparator() + infoToSave[i];
        }
    }
    
    public void setCodeSaveInfo(String[] infoToSave)
    {
        codeInfo = infoToSave;
    }
    
    public void saveInfo() throws Exception
    {
        File f = new File(saveName);
        FileOutputStream fos = new FileOutputStream(f);
        PrintWriter pw = new PrintWriter(fos);
        
        pw.write(characterInfo);
        pw.flush();
        fos.close();
        pw.close();
        
        f.setReadable(true);
        
        System.out.println();
        System.out.println("++++++++++++++++++++");
        System.out.println("++++ File Saved ++++");
        System.out.println("++++++++++++++++++++");
    }
    
    public void codeSaveInfo() throws Exception
    {
    	ArrayList<String> codeCopy = new ArrayList<String>();
    	
    	for(String info : codeInfo)
    	{
    		codeCopy.add(info);
    	}
    	
    	codeCopy.removeAll(Collections.singleton(null));
    	
        File f = new File(saveName);
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
		
		for(int i = 0; i < codeCopy.size(); i++)
		{
			String temp = codeCopy.get(i);
			temp = temp.replaceAll("\n",  "null");
	
			if(codeCopy.get(i).indexOf("null") == -1)
				pw.println(codeCopy.get(i));
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
}