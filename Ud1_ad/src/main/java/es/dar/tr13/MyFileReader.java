package es.dar.tr13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader 
{
	public static void main(String[] args) 
	{
		int caract = 0;
		FileReader fr = null;

		try 
		{
			// Abrir el fichero indicado en la variable nombreFichero
			fr = new FileReader("prueba.txt");

			// Leer el primer caracter
			// Se debe almacenar en una variable de tipo int
			caract = fr.read();
			// Se recorre el fichero hasta encontrer el caracter -1 que marca el final del
			// fichero
			while (caract != -1) 
			{

				// Mostrar en pantalla el caracter leido convertido en char
				System.out.print((char) caract);
				// Leer el siguiente caracter
				caract = fr.read();
			}
		}
		catch (FileNotFoundException fileNotFoundException) 
		{
			fileNotFoundException.printStackTrace();
		}
		catch (IOException iOException) 
		{
			iOException.printStackTrace();
		}
		finally {
			if (fr == null) 
			{
				try 
				{
					fr.close();
				} 
				catch (IOException iOException) 
				{
					iOException.printStackTrace();
				}
			}
		}
	}
}
