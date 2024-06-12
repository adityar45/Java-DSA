/*
29 27 25 23 21
19 17 15 13
11 9 7
5 3
1
 */

import java.util.*;

class program9 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();

       int num = (rows*rows) + (rows-1);
       
       for(int i = 1; i <= rows; i++) {

           for(int j = rows; j >= i; j--) {

               System.out.print(num+" ");
               num-=2;
           }
           System.out.println();
       }
       sc.close();

   }
}
