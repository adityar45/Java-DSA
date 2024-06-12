/*
5 d 3 b 1
4 c 2 a
3 b 1
2 a
1
 */

import java.util.*;

class program7 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();

       for(int i = rows; i >= 1; i--) {

        int temp = i;
        int ch = i + 96;

           for(int j = 1; j <= i; j++) {

            if(rows % 2 == 0)
            {
               if(j % 2 == 0)
               {
                System.out.print(temp+" ");
                temp--;
                ch--;
               }
               else
               {
                System.out.print((char)ch+" ");
                ch--;
                temp--;
               }
            }
            else
            {
               if(j % 2 == 1)
               {
                System.out.print(temp+" ");
                temp--;
                ch--;
               }
               else
               {
                System.out.print((char)ch+" ");
                ch--;
                temp--;
               }
            }
           }
           
           System.out.println();
       }
       sc.close();

   }
}
