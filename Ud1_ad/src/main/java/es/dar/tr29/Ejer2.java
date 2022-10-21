package es.dar.tr29;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Ejer2 {
	public static void main(String[] args) {
	
		
		FileInputStream fileInputStream = null;
		DataInputStream dataInputStream = null;
		try {
			fileInputStream = new FileInputStream("myDoc.txt");
			dataInputStream = new DataInputStream(fileInputStream);

			while (true) {
				
				System.out.print(dataInputStream.readInt());
				System.out.print(dataInputStream.readUTF());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dataInputStream != null) {
				try {
					dataInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
