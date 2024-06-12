/*
4       25      6       49
8       81      10      121
12      169     14      225
16      289     18      361

9       4       25
6       49      8
81      10      121
 */

import java.util.*;

class program6 {
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
            else
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