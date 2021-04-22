import java.util.Scanner;

// kendisine yollanan sayýnýn asal olup olmadýðýný kontrol eden metodu yazýnýz.
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int sayi = scanner.nextInt();
		AsalMi(sayi);
	}
	public static void AsalMi(int sayi) {
		Boolean asal=true;
		for(int i = 2 ; i <= sayi/2 ; i++) {
			if(sayi%i==0) {
				asal=false;
			}
		}
		if(asal) {
			System.out.println("Sayi Asaldir!");
		}else if(!asal) {
			System.out.println("Sayi Asal Degildir!");
		}
	}

}
