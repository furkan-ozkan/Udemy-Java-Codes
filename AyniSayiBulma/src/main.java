// Dizide ayný olan sayiyi bulunuz
public class main {

	public static void main(String[] args) {
		int sayilar[]= {1,2,3,4,5,6,7,8,9,5,3};
		for(int i = 0 ; i < sayilar.length ; i++) {
			for(int j = i+1 ; j < sayilar.length ; j++) {
				if(sayilar[i] == sayilar[j]) {
					System.err.println(sayilar[i] + " Sayisi Tekrar Ediyor.");
				}
			}
		}
		
	}

}
