/*
                *
        *       *       *
*       *       *       *       *
 */

import java.util.*;

class program0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++)
        //for(int i = rows; i >= 1; i--)
        {

            //Spaces
            for(int space = rows; space > i; space--) 
            //for(int space = 1; space < rows; space++)
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                System.out.print("*\t");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
