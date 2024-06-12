/*
  4 4 4 4
    3 3 3
      2 2
        1
 */

 import java.util.*;

 class program6 {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter rows :");
         int rows = sc.nextInt();

         int num = rows;
 
         for(int i = 1; i <= rows; i++) {
 
             //Spaces
             for(int j = 1; j<= i; j++) {
                 System.out.print(" "+" ");
             }
 
             for(int j = rows; j >= i; j--) {
                 System.out.print(num+" ");
             }
            num--;
             System.out.println();
         }
         sc.close();
     }
 }
 
 
 



