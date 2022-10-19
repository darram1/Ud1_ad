package es.dar.tr24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main 
{
	public static void main(String[] args) 
	{
		 Random rnd = new Random();

	        try
	        {
	            FileOutputStream fileOutputStream = new FileOutputStream("file1.txt");
	            FileInputStream fileInputStream = new FileInputStream("file1.txt");
	            
	            fileOutputStream.write("David Armijo Ramos".getBytes());
	            fileOutputStream.flush();
	            byte miArray[]=new byte [18];

	            int outcome = fileInputStream.read(miArray);
	            
	            while (outcome != -1)
	            {
	                System.out.println("Voy a leer "+ outcome+" caracteres");
	                for (int i = 0; i <outcome; i++)
	                {
	                    System.out.print((char)miArray[i]);
	                }

	                outcome = fileInputStream.read(miArray);
	            }

	        }
	        catch (IOException ioException)
	        {
	            ioException.printStackTrace();
	        }
	}
}
