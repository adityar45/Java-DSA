/*
Enter rows :4
a       b       c       d
        b       c       d
                c       d
                        d

Enter rows :3
A       B       C
        B       C
                C
 */

import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int ch1 = 64 + i;
            int ch2 = 96 + i;

            //Spaces
            for(int space = 1; space < i; space++) {

                System.out.print("\t");
            }

            if(rows % 2 == 1)
            {
                 //Data
                for(int j = rows; j >= i; j--) {
                System.out.print((char)ch1+"\t");
                ch1++;
                }
            }
            else
            {
                //Data
               for(int j = rows; j >= i; j--) {
               System.out.print((char)ch2+"\t");
               ch2++;
               }
           }

           
            
            System.out.println();
        }
        sc.close();
    }
}