import java.io.*;
import static java.lang.System.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;

@SuppressWarnings("unused")
public class Test
{
	public static void main(String args[]) throws Exception
    {
		Scanner wolf = new Scanner(System.in);
	//	EditCharacter test = new EditCharacter();
	//	test.characterEdit();
		
	//	MasterCharacter mc = new MasterCharacter();
	//	mc.createMasterCharacter();
		
		boolean quit = false;
		System.out.println(quit);
		
		while(quit != true)
		{
			int quitProb = (int) (Math.random() * 10);
			
			if(quitProb > 2)
				quit = false;
			else
				quit = true;
			
			System.out.println(quit);
		}
		
		wolf.close();
    }
}