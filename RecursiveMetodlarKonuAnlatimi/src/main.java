
public class main {

	public static void main(String[] args) {
		
		//Saydir(5);
		
	}
	public static void Saydir(int sayi) {
		System.out.println(sayi);
		if(sayi>0) {
			Saydir(sayi-1);
		}
	}

}
