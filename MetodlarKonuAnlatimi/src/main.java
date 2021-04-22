import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		int sayi1=scanner.nextInt(),sayi2=scanner.nextInt();
		int toplam = sayi1+sayi2;
		System.out.println(toplam);
		
		SelamVerme();
		ToplamaYap();*/
		float s = Topla(9,3);
		System.out.println(s);
		
		
	}
	
	public static float Topla(int sayi1,int sayi2) {
		float  toplam = sayi1+sayi2;
		return  toplam;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ToplamaYap() {
		Scanner scanner = new Scanner(System.in);
		int sayi1=scanner.nextInt(),sayi2=scanner.nextInt();
		int toplam = sayi1+sayi2;
		System.out.println(toplam);
	}
	public static void SelamVerme() {
		System.out.println("Selam!!");
	}

}
