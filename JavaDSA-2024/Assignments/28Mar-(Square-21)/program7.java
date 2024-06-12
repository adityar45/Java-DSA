/*
Enter rows :    4
4       A       6       A
8       B       10      B
12      C       14      C
16      D       18      D

Enter rows :    3
A       4       A
6       B       8
C       10      C
 */

import java.util.*;

class program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :\t");
        int rows = sc.nextInt();

        int num = rows;
        int ch = 65;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {

            if(rows % 2 == 1)
            {
                if(i % 2 == 1)
                {
                    if(j % 2 == 1)
                    {
                        System.out.print((char)ch+"\t");
                        num++;
                    }
                    else
                    {
                        System.out.print(num+"\t");
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
                        System.out.print((char)ch+"\t");
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
                        System.out.print((char)ch+"\t");
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
                        System.out.print((char)ch+"\t");
                        num++;
                    }
                }
            }
            }
            ch++;
            System.out.println();
        }
        sc.close();
    }
}