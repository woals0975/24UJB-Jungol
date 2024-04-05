package Q633;

import java.util.Scanner;

public class Main {
	public static void main(String[]args ) {
		Scanner sc =new Scanner(System.in);
		String[] c = {"Korea","USA","Japan","China"};
		String[] d = {"Seoul","Washington","Tokyo","Beijing"};
		while(true) {
			System.out.printf("\n1. %s\n",c[0]);
			System.out.printf("2. %s\n",c[1]);	
			System.out.printf("3. %s\n",c[2]);	
			System.out.printf("4. %s\n",c[3]);
			System.out.println("number? ");
			int s = sc.nextInt();	
			if(s==1) {
			System.out.printf("%s\n",d[0]);			
			}else if(s==2){	
			System.out.printf("%s\n",d[1]);			
			}else if(s==3){
			System.out.printf("%s\n",d[2]);			
			}else if(s==4){
			System.out.printf("%s\n",d[3]);					
			}else {
				System.out.print("none");
				break;
				
			}
		
			}
		sc.close();
		}		
}