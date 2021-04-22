
public class main {

	public static void main(String[] args) {
		/*int sayilar[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i =0; i<sayilar.length; i++) {
			//System.out.println(i+". indexte bulunan deðer : " + sayilar[i]);
			if(sayilar[i]==5) {
				System.out.println("Aradýðýnýz index deðeri : " + i);
			}
		}*/
		int sayilar[]= {1,2,3,4,5,6,7,8,9,10};
		int digerSayiler[] = {12,13,5,3,2,1,7,46,21,19};
		int toplamDizisi[] = new int[10];
		
		for(int i = 0 ; i<sayilar.length ; i++) {
			toplamDizisi[i] = sayilar[i] + digerSayiler[i];
		}
		for(int i = 0 ; i<sayilar.length ; i++) {
			System.out.println("Sayilar dizisinin " + i + ". indexsi = " + sayilar[i]);
			System.out.println("digerSayilar dizisinin " + i + ". indexsi = " + digerSayiler[i]);
			System.out.println("toplamDizisi dizisinin " + i + ". indexsi = " + toplamDizisi[i]);
			System.out.println();
		}
	}

}
