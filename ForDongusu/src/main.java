// For d�ng�s�
public class main {

	public static void main(String[] args) {
		
		for(int i=1 ; i<10 ; i++) {
			System.out.println(i);
		}
		// Bu Aral�kta Bulunan Kodlar Dizilerden Sonra Anlat�lm��t�r.
		int sayilar[] = {5,4,3,2,9,8,14,15,16,32,21,27,74};
		/*for(int i = 0 ; i < sayilar.length ; i++) {
			System.out.println(sayilar[i]);
		}*/
		for(int i : sayilar) {
			System.out.println(i);
		}
		// Bu Aral�kta Bulunan Kodlar Dizilerden Sonra Anlat�lm��t�r.
	}

}

/*
 * for(degiskenin baslang�� degeri;d�ng�n�n bitme kosulu;her turda tekrarlanacak bir i�lem){
 * bunlar� yap
 * }
 */
