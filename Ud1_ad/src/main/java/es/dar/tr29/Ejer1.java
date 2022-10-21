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

public class Ejer1 {

	public static void main(String[] args) {
		String numString = "";
		int linea = 1;
		boolean finzalizador = false;

		Scanner sc = new Scanner(System.in);
		FileOutputStream fileOutputStream = null;
		DataOutputStream dataOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("myDoc.txt");
			dataOutputStream = new DataOutputStream(fileOutputStream);

			do {
				System.out.println("Linea " + linea + ": ");

				do {
					numString = sc.nextLine();
					finzalizador = numString.toLowerCase().equals("intro");

					if (!validarNumero(numString) && !finzalizador) {
						System.out.println("Tipo de formato introducido invalido, debes introducir un numero entero");
					} else if (!finzalizador) {
						dataOutputStream.writeUTF(numString);
						dataOutputStream.writeUTF(" ");
					}

				} while (!validarNumero(numString) && !finzalizador);

				if (!finzalizador) {
					do {
						numString = sc.nextLine();

						if (!validarNumero(numString)) {
							System.out
									.println("Tipo de formato introducido invalido, debes introducir un numero entero");
						} else {
							dataOutputStream.writeUTF(numString);
							dataOutputStream.writeUTF("\n");
						}

					} while (!validarNumero(numString));
					linea++;
				}

			} while (!numString.toLowerCase().equals("intro"));

			System.out.print("Fin del Programa");

			dataOutputStream.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
			if (dataOutputStream != null) {
				try {
					dataOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static boolean validarNumero(String numString) {

		try {
			Integer.parseInt(numString);
			return true;

		} catch (NumberFormatException numberFormatException) {
			return false;
		}

	}
}
