package Q548;

public class Main {
	public static void main(String[] args) {
		int a=2,b=3,c=4;
		
		for(int i=1;i<=5;i++) {
			System.out.printf("%d * %d =%3d   ", a,i,a*i);
			if(i==5) {
				System.out.print("\n");
			}
		}
		for(int i=1;i<=5;i++) {
			System.out.printf("%d * %d =%3d   ", b,i,b*i);
			if(i==5) {
				System.out.print("\n");
			}
		}
		for(int i=1;i<=5;i++) {
			System.out.printf("%d * %d =%3d   ", c,i,c*i);
			if(i==5) {
				System.out.print("\n");
			}
		}
	}

}
