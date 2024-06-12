/*
                        4
                3       3       3
        2       2       2       2       2
1       1       1       1       1       1       1
 */

import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int num = rows;

        for(int i = 1; i <= rows; i++)
        {
            //Spaces
            for(int space = rows; space > i; space--)
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                System.out.print(num+"\t");
            }
            num--;
            System.out.println();
        }
        
        sc.close();

    }
    
}
