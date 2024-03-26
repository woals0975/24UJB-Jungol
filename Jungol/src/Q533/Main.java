package Q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a =sc.nextLine();
		char c =a.charAt(0);		
        int b =sc.nextInt();
        sc.close();
        
        if(c=='M') {
        	System.out.print("M");
        }else {System.out.print("F");}
        
        
        if(c=='M') {
        
        if(b>18){
	    	 System.out.print("MAN");
        }else { 
	    	 System.out.print("BOY");
        }
        }
	
        
        if(c=='F') {
 
          if(b>18) {
	    	 System.out.print("WOMAN");
          }
          }if(b<=18){ 
	    	 System.out.print("GIRL");
          }
	  
	} 
}
        

