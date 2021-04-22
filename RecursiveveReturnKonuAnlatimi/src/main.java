public class main {

	public static void main(String[] args) {
		
		System.out.println(Fact(5));
		
	}
	
	public static int Fact(int sayi) {
		if(sayi<=1) {
			return 1;
		}
		return sayi*Fact(sayi-1);
	}

}
