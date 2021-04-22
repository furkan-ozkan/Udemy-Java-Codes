import java.util.Scanner;

// while döngüsü
public class main {

	public static void main(String[] args) {
		int sayi;
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Lütfen döngünün tekrarlamasýný istediðini miktarý girin : ");
		sayi=scanner.nextInt();
		
		while(sayi>0) {
			System.out.println("besten kücük bir sayý");
			sayi--;
		}
		
	}

}
/*
 * 
 * if(burasý gerçekleþirse){
 * burasýný yap
 * }
 * while(burasýgerçekleþtiðisürece){
 * burasýný yap
 * }
 * 
 * */