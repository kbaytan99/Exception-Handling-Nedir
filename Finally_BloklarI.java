package Exceptions;
public class Finally_BloklarI {
	
	// 3 farkli blogu var
	public static void main(String[] args) {

	try {
		//String s = null;
		int a = 30 /0;
	//	System.out.println(a.hashCode());
		
		
	}
	catch(ArithmeticException b) {
		System.out.println("Bir Sayi 0a bolunemez.");
	}
	catch (NullPointerException a){
		System.out.println("Null Referans Hatasi.....");
		}
	finally {
		System.out.println("Finally Blogu Çalisiyor.....");//Herturlu çalisiyor..
	}
	System.out.println("Finally varsa burasi çalismaz, tabi Exceptions uymuyor ise.");
	}
}