package es.dar.tr26;

import java.io.DataOutputStream;
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
		FileOutputStream fileOutputStream = null;
		DataOutputStream dataOutputStream = null;
		 try 
		 {
			fileOutputStream = new FileOutputStream("myDoc.txt");
			dataOutputStream = new DataOutputStream(fileOutputStream);
			
			dataOutputStream.writeBoolean(true);
			dataOutputStream.writeChar('5');
			dataOutputStream.writeDouble(-2.5353d);
			dataOutputStream.writeFloat(15.070707f);
			dataOutputStream.writeInt(1);
			dataOutputStream.writeLong(123456l);
			
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
}
