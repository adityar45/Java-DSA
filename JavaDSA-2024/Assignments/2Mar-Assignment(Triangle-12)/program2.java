/*
a
$ $
a b c
$ $ $ $
 */

import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++) {
            char ch ='a';

            for(int j = 0; j <= i; j++) {

                if(i % 2 == 0)
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                else 
                {
                    System.out.print("$"+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
