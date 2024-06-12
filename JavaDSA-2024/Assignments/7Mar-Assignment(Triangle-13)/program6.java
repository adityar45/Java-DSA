/*
1 a 2 b
1 a 2
1 a
1
 */

import java.util.*;

class program6 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();

       for(int i = rows; i >= 1; i--) {

        int num = 1;
        char ch = 'a';

           for(int j = 1; j <= i; j++) {

               if(j % 2 == 1)
               {
                System.out.print(num+" ");
                num++;
               }
               else
               {
                System.out.print(ch+" ");
                ch++;
               }
           }
           System.out.println();
       }
       sc.close();

   }
}