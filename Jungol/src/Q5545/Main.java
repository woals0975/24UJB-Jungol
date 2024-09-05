package Q5545;

import java.util.Scanner;



public class Main {
	
	public static long GCD(long num1, long num2) {
		  if (num1 % num2 == 0) {
		      return num2;
		  }
		  return GCD(num2, num1%num2);
		}

	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long color = sc.nextLong() + 1;
        long light = sc.nextLong() + 1;
        long work = sc.nextLong();
        sc.close();
        long A = 0;  //둘다 완
        long B = 0;  //둘다 실패
        long C = 0;  //도색 O 광택 X
        long D = 0;  //도색 X 광택 O
      
        C = work/light;
        D = work/color;
        
        long B2 = Main.GCD(color,light); //최대 공약수 
        B2 = (color*light)/B2; // 최대 공배수
        B = work/B2;
        
        C= C-B;
        D= D-B;
        
        A=work-B-C-D;
        System.out.println(A + " " + B + " " + C + " " + D);
    }
}




//public class Test12 {
//    public static void main(String[] args) {
//        int num1 = 60;
//        int num2 = 48;
//
//        int gcd = getGCD(num1, num2);
//        System.out.println("the greatest common denominator : " + gcd);
//        System.out.println("the lowest common multiple : " + (num1 * num2) / gcd);
//        
//    }
//
//    public static int getGCD(int num1, int num2) {
//        if (num1 % num2 == 0) {
//            return num2;
//        }
//        return getGCD(num2, num1%num2);
//    }
//}   유클리드 호제법 2개일떄


//public class Test12 {
//    public static void main(String[] args) {
//        int[] arr = {2, 6, 8, 14};
//
//        System.out.println("the lowest common multiple : " + getLCM(arr));
//    }
//
//    public static int getLCM(int[] arr) {
//        if (arr.length == 1) {
//            return arr[0];
//        }
//
//        int gcd = getGCD(arr[0], arr[1]);
//        int lcm = (arr[0] * arr[1]) / gcd;
//
//        for (int i = 2; i < arr.length; i++) {
//            gcd = getGCD(lcm, arr[i]);
//            lcm = (lcm * arr[i]) / gcd;
//        }
//
//        System.out.println("the greatest common demoniator : " + gcd);
//
//        return lcm;
//    }
//
//    public static int getGCD(int num1, int num2) {
//        if (num1 % num2 == 0) {
//            return num2;
//        }
//        return getGCD(num2, num1 % num2);
//    }
//} 여러개일때.