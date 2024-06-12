/*
Enter rows :
4
D       e       f       g
H       i       j       k
L       m       n       o
P       q       r       s

Enter rows :
3
C       d       e
F       g       h
I       j       k
 */

import java.util.*;

class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int ch1 = rows + 64;
        int ch2 = rows + 96;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {

                if(j == 1)
                {
                    System.out.print((char)ch1+"\t");
                    ch1++;
                    ch2++;
                }
                else
                {
                    System.out.print((char)ch2+"\t");
                    ch1++;
                    ch2++;
                }
            }
            System.out.println();
    }
    sc.close();
}
}
