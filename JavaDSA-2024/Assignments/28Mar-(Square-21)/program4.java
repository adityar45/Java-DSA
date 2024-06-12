/*
D       5       6       7
H       9       10      11
L       13      14      15
P       17      18      19

C       4       5
F       7       8
I       10      11
 */

import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :\t");
        int rows = sc.nextInt();

        int num = rows;
        int ch = 64 + rows;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {

                if(j == 1)
                {
                    System.out.print((char)ch+"\t");
                    ch++;
                    num++;
                }
                else
                {
                    System.out.print(num+"\t");
                    num++;
                    ch++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}