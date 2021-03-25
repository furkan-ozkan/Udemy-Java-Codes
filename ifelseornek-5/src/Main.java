import java.util.Scanner;

/*Kullanýcýdan Alýnan Ders Notunun Harf Notu Karþýlýðýný Veren Program
 * 100-90	- AA
 * 90-80		- BA
 * 80-70		- BB
 * 70-60		- CB
 * 60-55		- CC
 * 55-0		- FF
 * */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ogrenciNotu;
		
		System.out.println("Lütfen notunuzu giriniz : ");
		ogrenciNotu=scanner.nextInt();
		
		if(ogrenciNotu>=90 && ogrenciNotu<=100) {
			System.out.println("AA");
		}
		else if(ogrenciNotu>=80 && ogrenciNotu<90) {
			System.out.println("BA");
		}
		else if(ogrenciNotu>=70 && ogrenciNotu<80) {
			System.out.println("BB");
		}
		else if(ogrenciNotu>=60 && ogrenciNotu<70) {
			System.out.println("CB");
		}
		else if(ogrenciNotu>=55 && ogrenciNotu<60) {
			System.out.println("CC");
		}
		else if(ogrenciNotu>=0 && ogrenciNotu<55) {
			System.out.println("KALDINIZ!");
		}
		else {
			System.out.println("Hatalý Bir Deger Girdiniz Lütfen Tekrar Deneyin!");
		}
		
	}

}
