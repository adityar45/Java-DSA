/*
      D 
    C D 
  B C D 
A B C D
 */

 import java.util.*;

 class program3 {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter rows :");
         int rows = sc.nextInt();
 
         for(int i = 1; i <= rows; i++) {
 
             char ch = 'A';
 
             //Spaces
             for(int j = 1; j<= rows-i; j++) {
                 System.out.print(" "+" ");
                 ch++;
             }
 
             for(int j = 1; j <= i; j++) {
                 System.out.print(ch+" ");
                 ch++;
             }
 
             System.out.println();
         }
         sc.close();
     }
 }
 
 
 
