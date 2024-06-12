/*
      1
    2 4
  3 6 9
4 8 12 16
 */

 import java.util.*;

 class program5 {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter rows :");
         int rows = sc.nextInt();
 
         for(int i = 1; i <= rows; i++) {
 
            int num = i;
 
             //Spaces
             for(int j = 1; j<= rows-i; j++) {
                 System.out.print(" "+" ");
             }
 
             for(int j = 1; j <= i; j++) {
                 System.out.print(+num*j+" ");
             }
 
             System.out.println();
         }
         sc.close();
     }
 }
 
 
 


