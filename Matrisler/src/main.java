public class main {

	public static void main(String[] args) {
		
		/*int sayilar[][]=new int[5][5];
		sayilar[0][1]=5;
		System.out.println(sayilar[0][1]);
		
		int sayilar[][]= {
				{1,2,3,4,5},
				{9,8,7,6,5},
				{12,13,11,17,19}
		};
		System.out.println(sayilar[2][2]);
		
		
		int sayilar[][]= {
				{1,2,3,4,5},
				{9,8,7,6,5},
				{12,13,11,17,19}
		};
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(sayilar[j][i] + " - ");
			}
			System.out.println();
		}
		*/
		
		int sayilarUc[][][]= {
				{{1,2,3},
					{2,5,7}},
				{{7,8,9},
					{2,3,4}}
		};
		for(int i = 0 ; i<2 ; i++) {
			for(int j = 0 ; j<2; j++) {
				for(int k = 0 ; k<3 ; k++) {
					System.out.print(sayilarUc[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
	}

}
