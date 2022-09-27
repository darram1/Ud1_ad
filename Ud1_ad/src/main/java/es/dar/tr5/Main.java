package es.dar.tr5;

import java.io.File;
import java.io.IOException;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		
		//file(ubicaccion, "nombre");
		File file1 = new File("miDirectorio");
		File file2 = new File(file1, "miFichero.txt");
		
		//Forma de hacer el fichero con un string
		//File f2 = new File("miDirectorio", "miFichero.txt");
				
		//Crear Carpeta
		System.out.print("Carpeta creado: ");
		System.out.println(file1.mkdirs());
				
		//Crear Fichero
		System.out.print("Fichero creado: ");
		System.out.println(file2.createNewFile());
				
			
	}
}
