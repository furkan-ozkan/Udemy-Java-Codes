import java.util.Scanner;

// Kullan�c�dan al�nan say�n�n pozitif mi negatif mi oldu�unu bulan program.
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		
		System.out.println("L�tfen Pozitif veya Negatif Bir Sayi Giriniz : ");
		sayi=scanner.nextInt();
		
		if(sayi<0) {
			System.out.println("Sayi Negatiftir!");
		}
		else if(sayi>0) {
			System.out.println("Sayi Pozitiftir!");
		}
		else {
			System.out.println("Sayi S�f�rd�r!");
		}
		
		
	}

}
