/*
Enter rows :3
9       16      25
6       7       8
81      100     121

Enter rows :4
9       16      25      36
7       8       9       10
121     144     169     196
15      16      17      18
*/

import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = 3;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {

            if(i % 2 == 1)
            {
                 //Data
                 System.out.print(num*num+"\t");
                 num++;
            }
            else
            {
                //Data
                System.out.print(num+"\t");
                 num++;
            }
        }
            System.out.println();
        }
        sc.close();
    }
}
