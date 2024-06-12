/*
4
3 6
2 4 6
1 2 3 4
 */

import java.util.*;

class program4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = rows;

        for(int i = 0; i < rows; i++) {

            int count = 1;

            for(int j = 0; j <= i ; j++) {

                System.out.print(num*count+"\t");
                count++;
        }
        num--;
        System.out.println();
        }
        sc.close();
    }
}