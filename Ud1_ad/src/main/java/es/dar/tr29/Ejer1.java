package es.dar.tr29;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejer1 
{
	public static void main(String[] args) 
	{
		String numString = "";
		int linea = 1;
		
		Scanner sc = new Scanner(System.in);
		FileOutputStream fileOutputStream = null;
		DataOutputStream dataOutputStream = null;
		 try 
		 {
			fileOutputStream = new FileOutputStream("myDoc.txt");
			dataOutputStream = new DataOutputStream(fileOutputStream);
			
			do {
				if(!numString.toUpperCase().equals("INTRO")) {
					System.out.println("Linea "+linea+": ");
					
					do{
						numString= sc.nextLine();
						if(validarNumero(numString)) {
							System.out.println("Tipo de formato introducido invalido, debes introducir un numero entero");
						}
					}while(validarNumero(numString));
					dataOutputStream.writeInt(Integer.parseInt(numString));
					
					
					dataOutputStream.writeUTF(" ");
					
					numString = sc.nextLine();
					dataOutputStream.writeInt(Integer.parseInt(numString));
					linea++;
				}
				
			}while(!numString.toUpperCase().equals("INTRO"));
			
			dataOutputStream.flush();
			
		} 
		 catch (FileNotFoundException e) 
		 {
			e.printStackTrace();
		} 
		 catch (IOException e) 
		 {
			e.printStackTrace();
		}
		 finally 
		 {
			if( dataOutputStream != null ) 
			{
				try 
				{
					dataOutputStream.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			
			if(fileOutputStream != null) 
			{
				try 
				{
					fileOutputStream.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static boolean validarNumero(String numString) {
			
			try {
				Integer.parseInt(numString);
				return true;
				
			}catch (NumberFormatException numberFormatException) {
				return false;
			}
			
			
	}
}
