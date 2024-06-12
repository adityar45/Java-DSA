/*
Enter rows :4
                        1
                3       2       1
        5       4       3       2       1
7       6       5       4       3       2       1

Enter rows :3
                1
        3       2       1
5       4       3       2       1
 */

import java.util.*;

class program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int num = (i*2)-1;

            //Space
            for(int space = i; space < rows; space++) {

                System.out.print("\t");

            }

            //Data
            for(int j = 0; j < (i*2)-1; j++) {

                System.out.print(num+"\t");
                num--;
            }
            System.out.println();
        }
         
        sc.close();
    }
}