/*
16      5       36      7
8       81      10      121
144     13      196     15
16      289     18      361

3       16      5
36      7       64
9       100     11
 */

import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :\t");
        int rows = sc.nextInt();

        int num = rows;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {


            if(rows % 2 == 1)
            {
                if(i % 2 == 1)
                {
                    if(j % 2 == 1)
                    {
                        System.out.print(num+"\t");
                        num++;
                    }
                    else
                    {
                        System.out.print(num*num+"\t");
                        num++;
                    }
                }
                else
                {
                    if(j % 2 == 0)
                    {
                        System.out.print(num+"\t");
                        num++;
                    }
                    else
                    {
                        System.out.print(num*num+"\t");
                        num++;
                    }
                }
            }
            else
            {
                if(i % 2 == 1)
                {
                    if(j % 2 == 0)
                    {
                        System.out.print(num+"\t");
                        num++;
                    }
                    else
                    {
                        System.out.print(num*num+"\t");
                        num++;
                    }
                }
                else
                {
                    if(j % 2 == 1)
                    {
                        System.out.print(num+"\t");
                        num++;
                    }
                    else
                    {
                        System.out.print(num*num+"\t");
                        num++;
                    }
                }
            }
            }
            System.out.println();
        }
        sc.close();
    }
}