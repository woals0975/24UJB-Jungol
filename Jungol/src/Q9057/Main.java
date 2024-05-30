package Q9057;

public class Main {
	public static void main(String[] args ) {
		for(int i=0; i<3;i++) {
				for(int j=0; j<3;j++) {
					if(j<=i) {
						System.out.print("*");
					}
					if(j==2) {
						System.out.println();
					}
				}
		}
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				if(j>=i) {
					System.out.print("*");
				}
				if(j==2) {
					System.out.println();
				}
			}
	}
	}

}
