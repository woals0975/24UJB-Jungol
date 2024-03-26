package Q558;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[] ar = new int[100];
      int idx = 0;

      while (true) {
         ar[idx] = scanner.nextInt();
         if (ar[idx] == 0) {
            break;
         }
         idx++;
      }
      for (int i = idx-1; i >= 0; i--) {
         System.out.print(ar[i] + " ");
      }
      scanner.close();

   }

}

			

