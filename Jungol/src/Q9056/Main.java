package Q9056;

public class Main {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				if(j==3) {
					System.out.println();
				}
			}
		}
	}

}
