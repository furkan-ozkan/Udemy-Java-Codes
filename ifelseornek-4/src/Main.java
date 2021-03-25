import java.util.Scanner;

// kullanýcý giriþ sistemi
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kullaniciAdi="Admin",sifre="123";
		String girilenKullaniciAdi,girilenSifre;
		
		System.out.println("Lütfen Kullanýcý Adýný Giriniz : ");
		girilenKullaniciAdi=scanner.nextLine();
		
		System.out.println("Lütfen Sifrenizi Giriniz : ");
		girilenSifre=scanner.nextLine();
		
		if(girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre)) {
			System.out.println("Sisteme Giriþ Yapýldý.");
		}
		else if(girilenKullaniciAdi.equals(kullaniciAdi)&& !girilenSifre.equals(sifre)) {
			System.out.println("Sifre Hatalý!");
		}
		else if(!girilenKullaniciAdi.equals(kullaniciAdi)&&girilenSifre.equals(sifre)) {
			System.out.println("Kullanýcý Adý Hatalý!");
		}
		else {
			System.out.println("Sisteme Giriþ Yapýlamadý!");
		}
		

	}

}
