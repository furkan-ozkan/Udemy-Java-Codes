import java.util.Scanner;

// Matris üzerinde istenilen bir sayinin satir ve sütununu bulmak
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi=scanner.nextInt();
		int sayilar[][]= {
				{12,15,17,22},
				{2,19,33,48},
				{91,76,84,6},
				{1,9,34,200}
		};
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				if(sayilar[i][j] == sayi) {
					System.out.println("Istediginiz sayinin Satiri = " + i);
					System.out.println("Istediginiz sayinin Sutunu = " + j);
				}
			}
		}
		
	}

}
