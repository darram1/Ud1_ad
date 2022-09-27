package es.dar.tr9;

import java.io.File;
import java.io.FileFilter;

public class Main 
{
	public static void main(String[] args) 
	{
		File miCarpeta = new File("C:\\Users\\2DAM\\Desktop\\Carpeta prueba");
		
		File[] misElementos = miCarpeta.listFiles(new miFileFilter());
		
	}
}
