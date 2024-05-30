package Q9059;

public class Main {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			int c = 4-i;
			for(int j = i+4 ; j>=0; j--,c--) {
				if(c>0) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				if(j==0) {
					System.out.print("\n");
				}
			}
		}
	}

}
