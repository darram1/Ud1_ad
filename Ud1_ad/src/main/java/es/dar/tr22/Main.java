package es.dar.tr22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main 
{
	public static void main(String[] args) 
	{
		FileOutputStream fileOutputStream =null;
		try {
			fileOutputStream = new FileOutputStream("myFile.txt",true) ;
			fileOutputStream.write(2);
			fileOutputStream.flush();
		
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
