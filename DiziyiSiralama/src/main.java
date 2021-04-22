// herhangi bir karmaþýk diziyi küçükten büyüðe doðru sýralayýn.
public class main {

	public static void main(String[] args) {
		int sayilar[]= {9,7,5,3,1,2,4,6,8};
		int gecici;
		// 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
		// 975312468
		// 795312468
		// 597312468
		// 397512468
		// 197532468
		// 129753468
		// 123759468
		for(int i = 0 ; i < sayilar.length ; i++) {
			for(int j = i+1 ; j < sayilar.length ; j++) {
				if(sayilar[j]<sayilar[i]) {
					gecici=sayilar[i];
					sayilar[i]=sayilar[j];
					sayilar[j]=gecici;
				}
			}
		}
		for(int i = 0 ; i < sayilar.length ; i++) {
			System.out.print(sayilar[i] + " - ");
		}
		
	}

}
