/*
Number of rows = 3
C3 C2 C1
C4 C3 C2
C5 C4 C3
Number of rows = 4
D4 D3 D2 D1
D5 D4 D3 D2
D6 D5 D4 D3
D7 D6 D5 D4
 */

import java.util.*;

class program2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int ch = rows + 64;

        for(int i = 0; i < rows; i++) {

            int num = rows + i;   //to count num

            for(int j = 0; j <rows; j++) {

                System.out.print((char)ch+""+num+"\t");
                num--;
            }
            System.out.println();
        }
        sc.close();
    }
}
