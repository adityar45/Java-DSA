/*
                        1
                1       2       1
        1       2       3       2       1
1       2       3       4       3       2       1
 */

import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();


        for(int i = 1; i <= rows; i++)
        {

            int num = 1;

            //Spaces
            for(int space = rows; space > i; space--)
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                if(j < i)
                {
                    System.out.print(num+"\t");
                    num++;
                }
                else
                {
                    System.out.print(num+"\t");
                    num--;
                }    
            }

            System.out.println();
        }

        sc.close();

    }
    
}