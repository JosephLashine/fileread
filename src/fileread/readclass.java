package fileread;
import java.io.*;
import java.util.*;
public class readclass {

	private Scanner x;
	
	public void openFile(){
		
	
	try{
		  x = new Scanner(new File ("chris.txt"));
		  
		  
	  }
	  catch (Exception e) {
		  System.out.println("you got an error");
	  }
}
	public void readFile() {
		
		  while(x.hasNext())
		  {
			  
			  System.out.print(x.nextLine() + "\n");
			  
		  }
	}
		  public void closeFile()
		  {
			 x.close();
		  }

}
