package es.dar.tr8;

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
		
		file1.mkdir();
		file2.createNewFile();
		
		//Informacion general
		System.out.println(file2.lastModified());
		System.out.println(file2.length());
		
		//Nombre de ficheros
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getPath());
		System.out.println(file2.renameTo(new File(file1, "puta.txt")));
		
		//Predicados sobre ficheros
		System.out.println(file2.exists());
		System.out.println(file2.canWrite());
		System.out.println(file2.canRead());
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());
		System.out.println(file2.isAbsolute());
		
		//Borrar un fichero
		//System.out.println(file2.delete());
		
	}
}
