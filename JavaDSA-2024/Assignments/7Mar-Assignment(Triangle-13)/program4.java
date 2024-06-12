/*
Enter rows :4
J       I       H       G
F       E       D
C       B
A

Enter rows :3
F       E       D
C       B
A
 */

import java.util.*;

class program4 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();

       int ch = rows * (rows + 1) / 2 + 64;
       
       for(int i = 1; i <= rows; i++) {

           for(int j = rows; j >= i; j--) {

               System.out.print((char)ch+"\t");
               ch--;
           }
           
           System.out.println();
       }
       sc.close();

   }
}