import java.util.Scanner;

//kullanicinin girdigi sayiya kadar olan mükemmel sayilari bulan program
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen Bir Sayi Giriniz : ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		for(int i = 1 ; i<sayi ; i++) {
			for(int j = 1 ; j<=i/2 ; j++) {
				if(i%j==0) {
					toplam+=j;
				}
			}
			if(toplam == i) {
				System.out.println(i + " Sayisi Mükemmel Bir Sayidir!");
			}
			toplam = 0;
		}
		
	}
// 28 -> 14 7 4 2 1
}
