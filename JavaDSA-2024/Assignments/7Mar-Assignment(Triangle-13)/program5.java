/*
A B C D
a b c
A B
a
 */

import java.util.*;

class program5 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();

       for(int i = 1; i <= rows; i++) {

        char ch1 = 'A';
        char ch2 = 'a';

           for(int j = rows; j >= i; j--) {

               if(i % 2 == 1)
               {
                System.out.print(ch1+" ");
                ch1++;
               }
               else
               {
                System.out.print(ch2+" ");
                ch2++;
               }
           }
           
           System.out.println();
       }
       sc.close();

   }
}
