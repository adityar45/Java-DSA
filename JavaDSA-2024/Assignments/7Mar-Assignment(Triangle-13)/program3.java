/* 
30 28 26 24 22
20 18 16 14
12 10 8
6 4
2
*/

import java.util.*;

class program3 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();

       int num = rows * (rows + 1); //to get the starting number so that last number will be 2
       
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