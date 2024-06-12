/*
D       C       B       A
4       4       4       4
D       C       B       A
4       4       4       4
 */

import java.util.*;

class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :\t");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int ch = rows + 64;

            for(int j = 1; j <= rows; j++) {

                if(i % 2 == 1)
                {
                    System.out.print((char)ch+"\t");
                    ch--;
                }
                else
                {
                    System.out.print(rows+"\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
