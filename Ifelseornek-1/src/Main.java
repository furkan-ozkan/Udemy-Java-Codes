import java.util.Scanner;

// Kullanýcýdan alýnan sayýnýn pozitif mi negatif mi olduðunu bulan program.
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		
		System.out.println("Lütfen Pozitif veya Negatif Bir Sayi Giriniz : ");
		sayi=scanner.nextInt();
		
		if(sayi<0) {
			System.out.println("Sayi Negatiftir!");
		}
		else if(sayi>0) {
			System.out.println("Sayi Pozitiftir!");
		}
		else {
			System.out.println("Sayi Sýfýrdýr!");
		}
		
		
	}

}
