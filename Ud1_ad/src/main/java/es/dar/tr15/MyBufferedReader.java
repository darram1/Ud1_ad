package es.dar.tr15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader 
{
	public static void main(String[] args) 
	{
		String cad = "";
		File myFile = new File ("prueba.txt");
		FileReader myFileReader = null;
		BufferedReader myBufferedReader = null;
		
		if (myFile.exists()) 
		{
			
			try 
			{
				myFileReader = new FileReader(myFile);
				
				cad = myBufferedReader.readLine();
				
				while (cad != null) 
				{
					System.out.println(cad);
					cad = myBufferedReader.readLine();
				}
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally 
			{
				if(myBufferedReader != null) 
				{
					try 
					{
						myBufferedReader.close();
					}
					catch (IOException e) 
					{
						e.printStackTrace();
					}
				}
				if(myFileReader != null) 
				{
					try 
					{
						myFileReader.close();
					}
					catch (IOException e) 
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
}
