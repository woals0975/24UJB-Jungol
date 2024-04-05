package Q616;

import java.util.Scanner;

class XY {
	private int[] xy1;
	private int[] xy2;
	private int[] xy3;

	public XY(int[] xy1, int[] xy2, int[] xy3) {
		this.xy1 = xy1;
		this.xy2 = xy2;
		this.xy3 = xy3;
	}

	public void PointPrint() {
		int sumx = xy1[0] + xy2[0] + xy3[0];
		int sumy = xy1[1] + xy2[1] + xy3[1];
		double avgx = (double) sumx / 3; //x¿«∆Ú±’
		double avgy = (double) sumy / 3; //y¿«∆Ú±’
		System.out.printf("(%.1f, %.1f)", avgx, avgy);
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] xy1 = new int[2]; //¡¬«• x y¥œ±Ó 2
		int[] xy2 = new int[2];
		int[] xy3 = new int[2];
		for (int i = 0; i <=xy1.length; i++) { //¡°¿Ã 3∞≥
			for (int j = 0; j < xy1.length; j++) {//x, y 
				int a = sc.nextInt();
				if (i == 0) { //xy1
					xy1[j] = a;
				}
				if (i == 1) { //xy2
					xy2[j] = a;
				}
				if (i == 2) { //xy3
					xy3[j] = a;
				}
				if (i == 2 && j == 1) { //¡æ∑·Ω√¡°
					XY A = new XY(xy1, xy2, xy3);
					A.PointPrint();
					sc.close();

				}

			}
		}

	}
}
		
		
//sumx = xy1[0] + xy2[0] + xy3[0];
//sumy = xy1[1] + xy2[1] + xy3[1];
//avgx = (double)sumx / 3;
//avgy = (double)sumy / 3;
//System.out.printf("(%.1f, %.1f)", avgx, avgy);
		
		
		
		/*Scanner sc = new Scanner(System.in);
		int z =0; //»¶ºˆ
		int x =0; //¬¶ºˆ
		for(int i=1; i<=6; i++){
		int a = sc.nextInt();
		if(i%2==1) {
			z = z+a;
		}else {
			x = x+a;	
		}
		if(i==6) {
		double Z =(double)z/3;
		double X =(double)x/3;
		System.out.printf("(%.1f, %.1f)",Z,X);
		sc.close();
		}
		}
		
	}
}
*/