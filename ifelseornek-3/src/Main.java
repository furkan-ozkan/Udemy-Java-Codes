//100 tl �zerinde kargo �creti yok!
public class Main {

	public static void main(String[] args) {
		int urunlerToplami,urun1=9,urun2=19,urun3=47;
		urunlerToplami=urun1+urun2+urun3;
		if(urunlerToplami>=100) {
			System.out.println("Toplam �denecek �cret = "+urunlerToplami);
		}
		else {
			System.out.println("�r�nlerin Toplam Fiyat� = "+urunlerToplami);
			System.out.println("Kargo �creti = "+10);
			System.out.println("Toplam �denecek �cret = "+(urunlerToplami+10));
		}
	}

}
