/*
E
F G
H I J
K L M N
 */

import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int ch = (rows + 64) + 1; //we need D if value is 3 thats why 65 not 64

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j <= i; j++) {

                System.out.print((char)ch+" ");
                ch++;
            
            }
            System.out.println();
        }
        sc.close();
    }
}
