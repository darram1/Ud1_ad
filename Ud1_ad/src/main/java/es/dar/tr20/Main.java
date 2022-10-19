package es.dar.tr20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main 
{
	public static void main(String[] args) 
	{
		
		
		if(ctrlArgs(args)) 
		{
			copiarFichero(args[0], args[1]);
		}
	}
	
	public static boolean ctrlArgs(String [] args) 
	{
		boolean ejecucion=false;
		if (args.length > 2) {
			System.out.print("Hay mas de dos parametros.");
		}else if (args.length == 0) {
			System.out.print("Parametros no pasados, pasale dos");
		}else {
			ejecucion = true;
		}
		return ejecucion;
	}
	
	public static void copiarFichero (String fichero1, String fichero2) 
	{
		int caract=' ';
		
		File file1 = new File(fichero1);
		File file2 = new File(fichero2);
		FileReader fileReader = null;
		FileWriter fileWriter = null;
	
		try 
		{
			fileReader = new FileReader(file1);
			fileWriter = new FileWriter(file2);
			
			fileReader.read();
			
			while (caract != -1) 
			{
				fileWriter.write( (char) caract);
				
				
				caract = fileReader.read();
				
			}
			
			
		} 
		catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
			
		} 
		catch (IOException iOException) {
			iOException.printStackTrace();
		}
		finally 
		{
			if(fileReader!=null) 
			{
				try 
				{
						fileReader.close();
					} 
				catch (IOException e) 
				{
						e.printStackTrace();
				}
			}
			if(fileWriter!=null) {
				try 
				{
					fileWriter.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		
	}
}
