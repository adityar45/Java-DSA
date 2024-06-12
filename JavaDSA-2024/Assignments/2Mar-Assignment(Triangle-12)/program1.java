/*
9
9 9
9 9 9 
*/

import java.util.*;

class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int temp = rows*rows;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(temp+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
