/*
                        1
                B       B       B
        3       3       3       3       3
D       D       D       D       D       D       D
 */

import java.util.*;

class program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int num = 1;
        int ch = 65;

        for(int i = 1; i <= rows; i++)
        {

            //Spaces
            for(int space = rows; space > i; space--)
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                if(i % 2 == 1)
                {
                    System.out.print(num+"\t");
                }
                else
                {
                    System.out.print((char)ch+"\t");
                }
            }
            num++;
            ch++;
            System.out.println();
        }

        sc.close();

    }
    
}