public class main {

	public static void main(String[] args) {
		
		System.out.println(Toplama(1,5,3,4,2,7,16,13,19,17));

	}
	public static int Toplama(int... sayi1) {
		int toplam=0;
		for(int i:sayi1) {
			toplam+=i;
		}
		return toplam;
	}

}
