package Exceptions;

public class Try_ve_Catch_Bloklari_ile_Ýstisna_Yakalama {

public static void main(String[] args) {
//	int a = 30 / 0; // UNCHECKED EXCEPTIONS
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at Exceptions.Main.main(Main.java:6)
//	int[] b = {1,2,3,4,5,6,7,8,9};
//	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
//	at Exceptions.Main.main(Main.java:11)
//	System.out.println(b[10]);
//	System.out.println("Burasi Çalisiyor");
	
	
	try {
	int b = 30/0;
		int[]a = {1,2,3,4,5};
		System.out.println(a[6]); //OTOMATIK HATAYI ARIYOR
	}catch (ArithmeticException e) {
		System.out.println("Bir Sayi 0 a bolunemez");
	}
	catch (ArrayIndexOutOfBoundsException a) {
	System.out.println("Array Boyutu astinizz");
	//a.printStackTrace(); //hatta kodunu gosteriyor.. 
	}// ozelden genele dogru gitmeli hatalar
	catch (Exception e) {
		System.out.println("Bir Hata Olustu");
	}
	System.out.println("Burasi Çalisiyor");
	
}

}
