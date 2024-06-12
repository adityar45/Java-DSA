/*
Rows = 4
1 2 3 4
C B A
1 2
A
Rows = 5
1 2 3 4 5
D C B A
1 2 3
B A
1
 */

import java.util.*;

class program9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++) {

        int ch = rows + 64 - i; //to calculate char at each iteration
        int num = 1;

            for(int j = rows; j > i ; j--) {
                                          
                if(i % 2 == 1)
                {
                    System.out.print((char)ch+"\t");
                    ch--;
                }
                else
                {
                    System.out.print(num+"\t");
                    num++;
                }
        }
        System.out.println();
        }
        sc.close();
    }
}

