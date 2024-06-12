/*
Rows = 4
2 4 6 8
10 12 14
16 18
20
Rows = 5
2 4 6 8 10
12 14 16 18
20 22 24
26 28
30
 */

import java.util.*;

class program7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = 2;

        for(int i = 0; i < rows; i++) {

            for(int j = rows; j > i ; j--) {

                System.out.print(num+"\t");
                num+=2;
        }
        System.out.println();
        }
        sc.close();
    }
}
