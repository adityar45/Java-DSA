/*
Rows = 3
1
2 4
3 6 9
Rows = 4
1
2 4
3 6 9
4 8 12 16
 */

import java.util.*;

class program5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = 1;

        for(int i = 0; i < rows; i++) {

            int count = 1;

            for(int j = 0; j <= i ; j++) {

                System.out.print(num*count+"\t");
                count++;
        }
        num++;
        System.out.println();
        }
        sc.close();
    }
}
