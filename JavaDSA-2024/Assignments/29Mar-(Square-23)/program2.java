/*
Enter rows :4
d       e       f       G
h       i       j       K
l       m       n       O
p       q       r       S

Enter rows :3
c       d       E
f       g       H
i       j       K
 */

import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int ch1 = rows + 64;
        int ch2 = rows + 96;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {

                if(j == rows)
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
