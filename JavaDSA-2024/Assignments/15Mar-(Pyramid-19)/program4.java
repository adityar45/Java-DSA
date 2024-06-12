/*
                        A
                B       B       B
        C       C       C       C       C
D       D       D       D       D       D       D
 */

import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int num = 65;

        for(int i = 1; i <= rows; i++)
        {
            //Spaces
            for(int space = rows; space > i; space--)
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                System.out.print((char)num+"\t");
            }
            num++;
            System.out.println();
        }
        sc.close();

    }
    
}

