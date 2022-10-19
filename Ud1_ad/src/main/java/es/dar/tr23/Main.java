package es.dar.tr23;

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


	            fileOutputStream.write(0);
	            fileOutputStream.write(1);
	            fileOutputStream.write(2);
	            fileOutputStream.write(3);
	            fileOutputStream.write(4);
	            fileOutputStream.write(5);
	            fileOutputStream.write(6);
	            fileOutputStream.write(7);
	            fileOutputStream.write(8);



	            FileInputStream fileInputStream = new FileInputStream("file1.txt");

	            byte miArray[]=new byte [7];

	            int outcome = fileInputStream.read(miArray);

	            while (outcome != -1)
	            {
	                System.out.println("Voy a leer "+ outcome+" caracteres");
	                for (int i = 0; i <outcome; i++)
	                {
	                    System.out.println(miArray[i]);
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
