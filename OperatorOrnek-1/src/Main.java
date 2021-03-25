// 2 degiskenin degerlerini degistirme
public class Main {

	public static void main(String[] args) {
		int x=9,y=4;
		
		System.out.println(x+" <-> "+y);
		y=x+y;
		x=y-x ;//x->4
		y=y-x;//y->9
		System.out.println(x+" <-> "+y);

	}

}
