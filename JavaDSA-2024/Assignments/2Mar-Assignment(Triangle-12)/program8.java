/*
1
1 c
1 e 3
1 h 3 j
 */

import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        char ch = 'a';

        for(int i = 0; i < rows; i++) {

            int num = 1;

            for(int j = 0; j <= i; j++) {

                if(j % 2 == 0)
                {
                    System.out.print(num+" ");
                }
                else
                {
                    System.out.print(ch+" ");
                }
                num++;
                ch++;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
