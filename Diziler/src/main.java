
public class main {

	public static void main(String[] args) {
		
		int sayilar[] = {5,18,3,12,7,6,2,1};
		System.out.println(sayilar[1]);
		sayilar[1]=0;
		System.out.println(sayilar[1]);
		
		int bosSayilar[]= new int[5];
		bosSayilar[4]=12;
		bosSayilar[2]=4;
		
		System.out.println(bosSayilar[2]);
		
		System.out.println(sayilar[3]+bosSayilar[2]);
		
		
		
	}

}
