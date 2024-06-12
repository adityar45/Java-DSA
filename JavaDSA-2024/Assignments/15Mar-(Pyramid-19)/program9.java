/*
                        A
                a       b       a
        A       B       C       B       A
a       b       c       d       c       b       a
 */

import java.util.*;

class program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++)
        {
            int ch1 = 65;
            int ch2 = 97;

            //Spaces
            for(int space = rows; space > i; space--)
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                if(i % 2 == 1)
                {
                    if(j < i)
                    {
                    System.out.print((char)ch1+"\t");
                    ch1++;
                    }
                    else
                    {
                    System.out.print((char)ch1+"\t");
                    ch1--;
                    }
                }
                else
                {
                    if(j < i)
                    {
                    System.out.print((char)ch2+"\t");
                    ch2++;
                    }
                    else
                    {
                    System.out.print((char)ch2+"\t");
                    ch2--;
                    }
                    
                }
            }
            System.out.println();
        }

        sc.close();

    }
    
}