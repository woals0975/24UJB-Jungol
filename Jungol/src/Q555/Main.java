package Q555;

import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		char[] a = new char[10];
	

		for(int i=0; i<a.length; i++)
		{
		a[i] = sc.next().charAt(0);
		sc.close();
		
			
		}
		System.out.print(a);
		System.out.print(a[0]+" ");
		System.out.print(a[3]+" ");
		System.out.print(a[6]);
	}
}







//import java.util.*;

//public class Main {
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		char[] a = new char[10];	
//		
//		for (int i =0; i >=a.length;i++) {
//			a[i] = sc.next().charAt(0); //���ڿ��߿��� �Ǿ��� ĳ�����ϳ��� �̾ƿ�
//	        System.out.print(a);
//		}
//		}
//	}


	


