import java.util.Scanner;

// kullanýcýdan alýnýn sayýnýn faktöriyelini hesaplayan program.
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt(),toplam=1;
		
		// 5 -> 2x3x4x5
		
		for(int i = 2 ; i<=sayi ; i++) {
			toplam*=i;
		}
		System.out.println(toplam);
		
	}

}
