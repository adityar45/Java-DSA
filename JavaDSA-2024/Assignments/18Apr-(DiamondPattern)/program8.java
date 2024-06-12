/*
5 4 3 2 1
d c b a
3 2 1
b a
1
*/

import java.util.*;

class program8 {
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
               if(i % 2 == 0)
               {
                System.out.print(temp+" ");
                temp--;
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
                if(rows % 2 == 1)
                {
                   if(i % 2 == 1)
                   {
                    System.out.print(temp+" ");
                    temp--;
                   }
                   else
                   {
                    System.out.print((char)ch+" ");
                    ch--;
                    temp--;
                   }
                }
            }
           }
           
           System.out.println();
       }

       sc.close();
   }

}