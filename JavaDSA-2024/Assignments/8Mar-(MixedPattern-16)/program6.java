/*
Rows = 3
c
3 2
c b a

Rows = 4
d
4 3
d c b
4 3 2 1
 */

import java.util.*;

class program6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++) {

        int ch = rows + 96;
        int num = rows;

            for(int j = 0; j <= i ; j++) {

                if(i % 2 == 0)
                {
                    System.out.print((char)ch+"\t");
                    ch--;
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