package Q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		         //return��
		Scanner sc = new Scanner(System.in);
		String sex =sc.next(); //   nextLine(); �� ��Ÿ�ӿ���
		char c =sex.charAt(0);		
		//char c = sc.next().charAt(0);
        int age =sc.nextInt();
        sc.close();
        
        
        if(c=='M') {
        
        if(age>=18){
	    	 System.out.print("MAN");
        }else { 
	    	 System.out.print("BOY");
        }
        }
	
        
        if(c=='F') {
        	 if(age>=18) {
    	    	 System.out.print("WOMAN");
              
              }else{ 
    	    	 System.out.print("GIRL");
             
              }
        }
	}
}
              
              
              
      
    
        
        
         
