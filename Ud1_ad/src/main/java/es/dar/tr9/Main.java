package es.dar.tr9;

import java.io.File;

public class Main 
{
	public static void main(String[] args) 
	{
		File miCarpeta = new File("C:\\Users\\2DAM\\Desktop\\Carpeta prueba");
		
		File[] misElementos = miCarpeta.listFiles(new miFileFilter());
		
	}
}
