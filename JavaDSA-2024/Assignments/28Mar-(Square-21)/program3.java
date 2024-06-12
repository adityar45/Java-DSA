/*
16      5       6       7
64      9       10      11
144     13      14      15
256     17      18      19
*/

import java.util.*;

class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :\t");
        int rows = sc.nextInt();

        int num = rows;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {

                if(j == 1)
                {
                    System.out.print(num*num+"\t");
                    num++;
                }
                else
                {
                    System.out.print(num+"\t");
                    num++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
