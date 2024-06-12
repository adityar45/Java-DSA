/*
1
B C
1 2 3
G H I J
 */

import java.util.*;

class program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        char ch = 'A';

        for(int i = 0; i < rows; i++) {

            int num = 1;

            for(int j = 0; j <= i; j++) {

                if(i % 2 == 0)
                {
                    System.out.print(num+" ");
                    num++;
                }
                else
                {
                    System.out.print(ch+" ");
                }
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
