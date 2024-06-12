/*
D
D C
D C B
D C B A
 */

import java.util.*;

class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();


        for(int i = 0; i < rows; i++) {
            int ch = rows+64;

            for(int j = 0; j <= i; j++) {

                    System.out.print((char)ch+" ");
                    ch--;
            
            }
            System.out.println();
        }
        sc.close();
    }
}
