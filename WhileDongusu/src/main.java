import java.util.Scanner;

// while d�ng�s�
public class main {

	public static void main(String[] args) {
		int sayi;
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("L�tfen d�ng�n�n tekrarlamas�n� istedi�ini miktar� girin : ");
		sayi=scanner.nextInt();
		
		while(sayi>0) {
			System.out.println("besten k�c�k bir say�");
			sayi--;
		}
		
	}

}
/*
 * 
 * if(buras� ger�ekle�irse){
 * buras�n� yap
 * }
 * while(buras�ger�ekle�ti�is�rece){
 * buras�n� yap
 * }
 * 
 * */