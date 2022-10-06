package es.dar.tr17.ejer1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main 
{
	public static void main(String[] args) 
	{
		String fichero="prueba.txt";
		myFileReader(fichero);
	}
	
	public static void myFileReader (String fichero) 
	{
		// Inicializacion de variables
		int caract = 0;
		int aV = 0;
		int eV = 0;
		int iV = 0;
		int oV = 0;
		int uV = 0;
		char text = ' ';
		FileReader fr = null;
		
		try 
		{
			// Abrir el fichero indicado en la variable nombreFichero
			fr = new FileReader(fichero);

			// Leer el primer caracter
			// Se debe almacenar en una variable de tipo int
			caract = fr.read();
			
			// Se recorre el fichero hasta encontrer el caracter -1 que marca el final del
			// fichero
			while (caract != -1) 
			{
				text = (char) caract;
				// Mostrar en pantalla el caracter leido convertido en char
				System.out.print( text );
				// Contar numero de vocales de cada tipo
				
				if (text == 'a' || text == 'A') {
					aV++;
				}else if (text == 'e' || text == 'E') {
					eV++; 
				}else if (text == 'i' || text == 'I') {
					iV++; 
				}else if (text == 'o' || text == 'O') {
					oV++; 
				}else if (text == 'u' || text == 'U') {
					uV++; 
				}
				
				// Leer el siguiente caracter
				caract = fr.read();
			}
			
			//Muesta cuantas vocales
			System.out.println("\n\nVOCALES"
					+ "\nHay -> " + aV + " a"
					+ "\nHay -> " + eV + " e"
					+ "\nHay -> " + iV + " i"
					+ "\nHay -> " + oV + " o"
					+ "\nHay -> " + uV + " u");
		}
		catch (FileNotFoundException fileNotFoundException) 
		{
			fileNotFoundException.printStackTrace();
		}
		catch (IOException iOException) 
		{
			iOException.printStackTrace();
		}
		finally 
		{
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
