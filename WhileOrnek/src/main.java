import java.util.Scanner;

// kullan�c� negatif bir say� girene kadar girilen say�lar� toplayan bir program yaz�n�z
public class main {

	public static void main(String[] args) {
		int sayi,toplam=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L�tfen Bir Sayi Giriniz : ");
		sayi=scanner.nextInt();
		toplam+=sayi;
		
		while(sayi>=0) {
			System.out.println("L�tfen Bir Sayi Giriniz : ");
			sayi=scanner.nextInt();
			if(sayi>=0) {
				toplam+=sayi;
			}
		}
		System.out.println(toplam);
		
		
	}

}
