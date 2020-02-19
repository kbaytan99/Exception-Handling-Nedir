package Exceptions;

import java.util.Scanner;

public class Kendi_Exception_Siniflarimizi_Olusturmak {
	public static void mekan_kontrol(int yas) {
		
		if(yas < 18) {
			throw new InvalidAgeException("Invalid Age");
		}
		else {
			System.out.println("Selam");
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yas");
		int yas = scanner.nextInt();
		try {
		mekan_kontrol(yas);
		}catch (InvalidAgeException e) {
		e.printStackTrace();
		}
		

	}

}
