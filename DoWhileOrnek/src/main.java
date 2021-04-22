import java.util.Scanner;

// Kullanýcý negatif bir sayý girene kadar girilen sayýlarý toplayan programý yazýnýz.
public class main {

	public static void main(String[] args) {
		int sayi,toplam=0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Lutfen Sayiyi Girin : ");
			sayi= scanner.nextInt();
			if(sayi>=0) {
				toplam+=sayi;
			}
		}while(sayi>=0);
		System.out.println(toplam);
	}

}
