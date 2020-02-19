package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Throws_Anahtar_Kelimesi_Checked_Exception_ve_Unchecked_Exception_Farki {

	public static void mekan_kontrol(int yas) throws IOException {
		if(yas < 18) {
			throw new IOException();
		}
		else {
			System.out.println("Mekana Hosgeldin Genç...");
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen Yas Giriniz...");
		int yas = scanner.nextInt();
		
			mekan_kontrol(yas);
		
		}
	}
