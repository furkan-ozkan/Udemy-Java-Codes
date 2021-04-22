import java.util.Scanner;

// 0 ile x(x kullanýcýdan alýnacak) arasý asal sayilari bulan program
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi=scanner.nextInt();
		boolean asalMi=true;
		
		for(int i = 1 ; i < sayi ; i++) {
			for(int j = 2 ; j<i ; j++) {
				if(i%j==0) {
					asalMi=false;
				}
			}
			if(asalMi==false) {
				System.out.println(i + " Sayisi Asal Degildir.");
			}else {
				System.out.println(i + " Sayisi Asaldir.");
			}
			asalMi=true;
		}
		
		
	}

}
