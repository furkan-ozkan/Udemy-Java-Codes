import java.util.Scanner;

// Kullan�c� negatif bir say� girene kadar girilen say�lar� toplayan program� yaz�n�z.
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
