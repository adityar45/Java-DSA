/*
      1 
    1 2 
  1 2 3 
1 2 3 4 
 */

import java.util.*;

class program1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int num = 1;

            //Spaces
            for(int j = 1; j<= rows-i; j++) {
                System.out.print(" "+" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
        sc.close();
    }
}

