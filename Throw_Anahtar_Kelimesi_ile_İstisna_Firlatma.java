package Exceptions;

import java.util.Scanner;

public class Throw_Anahtar_Kelimesi_ile_Ýstisna_Firlatma {
	public static void mekan_kontrol(int yas) {
		if(yas < 18) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("Mekana Hosgeldin Genç...");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen Yas Giriniz...");
			int yas = scanner.nextInt();
		try {
			mekan_kontrol(yas);
		}
		catch(ArithmeticException e) {
			System.out.println("Tu Edad Es Menor Que 18..");
		}
	}

}
