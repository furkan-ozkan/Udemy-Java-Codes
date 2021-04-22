import java.util.Scanner;

// kullanýcý negatif bir sayý girene kadar girilen sayýlarý toplayan bir program yazýnýz
public class main {

	public static void main(String[] args) {
		int sayi,toplam=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Bir Sayi Giriniz : ");
		sayi=scanner.nextInt();
		toplam+=sayi;
		
		while(sayi>=0) {
			System.out.println("Lütfen Bir Sayi Giriniz : ");
			sayi=scanner.nextInt();
			if(sayi>=0) {
				toplam+=sayi;
			}
		}
		System.out.println(toplam);
		
		
	}

}
