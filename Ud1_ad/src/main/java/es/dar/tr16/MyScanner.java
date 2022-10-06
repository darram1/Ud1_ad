package es.dar.tr16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args) {
		/*
		 * La clase Scanner es la usada en el siguiente ejemplo
		 * su ventaja es que es un ppoco mas sencilla.
		 * 
		 * Requiere un objeto File y un Objeto tipo Scanner,
		 * Solo podria lanzar una excepción cuando no encuentra el archivo
		*/
		
		File archivo = new File("prueba.txt");
		
		try
		{
			Scanner lectura = new Scanner(archivo);
			
			while (lectura.hasNextLine()) {
				System.out.println(lectura.nextLine());
			}
			lectura.close();
		}
		
		catch (FileNotFoundException fileNotFoundException)
		{
			fileNotFoundException.printStackTrace();
		}
	}
}
