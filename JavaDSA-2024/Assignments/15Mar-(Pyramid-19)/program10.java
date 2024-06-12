/*
                        D
                C       D       C
        B       C       D       C       B
A       B       C       D       C       B       A
 */

import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int ch = rows + 64;

        for(int i = 1; i <= rows; i++)
        {

            //Spaces
            for(int space = rows; space > i; space--)
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                    if(j < i)
                    {
                    System.out.print((char)ch+"\t");
                    ch++;
                    }
                    else
                    {
                    System.out.print((char)ch+"\t");
                    ch--;
                    }
            }
            System.out.println();
        }

        sc.close();

    }
    
}