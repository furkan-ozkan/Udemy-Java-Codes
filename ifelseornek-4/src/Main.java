import java.util.Scanner;

// kullan�c� giri� sistemi
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kullaniciAdi="Admin",sifre="123";
		String girilenKullaniciAdi,girilenSifre;
		
		System.out.println("L�tfen Kullan�c� Ad�n� Giriniz : ");
		girilenKullaniciAdi=scanner.nextLine();
		
		System.out.println("L�tfen Sifrenizi Giriniz : ");
		girilenSifre=scanner.nextLine();
		
		if(girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre)) {
			System.out.println("Sisteme Giri� Yap�ld�.");
		}
		else if(girilenKullaniciAdi.equals(kullaniciAdi)&& !girilenSifre.equals(sifre)) {
			System.out.println("Sifre Hatal�!");
		}
		else if(!girilenKullaniciAdi.equals(kullaniciAdi)&&girilenSifre.equals(sifre)) {
			System.out.println("Kullan�c� Ad� Hatal�!");
		}
		else {
			System.out.println("Sisteme Giri� Yap�lamad�!");
		}
		

	}

}
