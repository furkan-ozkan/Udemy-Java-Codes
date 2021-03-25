//100 tl üzerinde kargo ücreti yok!
public class Main {

	public static void main(String[] args) {
		int urunlerToplami,urun1=9,urun2=19,urun3=47;
		urunlerToplami=urun1+urun2+urun3;
		if(urunlerToplami>=100) {
			System.out.println("Toplam Ödenecek Ücret = "+urunlerToplami);
		}
		else {
			System.out.println("Ürünlerin Toplam Fiyatý = "+urunlerToplami);
			System.out.println("Kargo Ücreti = "+10);
			System.out.println("Toplam Ödenecek Ücret = "+(urunlerToplami+10));
		}
	}

}
