import java.util.Scanner;

// 0 ile x arasý (x kullanýcýdan alýnacak) tek sayýlarý yazdýran program
public class main {

	public static void main(String[] args) {
		
		int sayi;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin : ");
		sayi= scanner.nextInt();
		
		
		for(int i = 0 ; i < sayi ; i++) {
			if(i%2!=0) {
				System.out.println(i + " Bir Tek Sayidir!");
			}
		}
		
	}

}
