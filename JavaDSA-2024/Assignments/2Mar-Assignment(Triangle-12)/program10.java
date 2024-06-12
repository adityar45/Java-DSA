/*
1
b c
4 5 6
g h i j
 */

import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int num = 1;
        char ch = 'a';

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j <= i; j++) {

                if(i % 2 == 0)
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
