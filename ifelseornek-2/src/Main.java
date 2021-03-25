// kullanýcýdan alýnan sayýnýn tek mi çift mi olduðunu bulan program
public class Main {

	public static void main(String[] args) {
		int sayi=101;
		
		if(sayi==0) {
			System.out.println("Sayi Sifirdir!");
		}
		else if(sayi%2 == 0){
			System.out.println("Sayi Çifttir!");
		}else{
			System.out.println("Sayi Tektir!");
		}

	}

}
