/*
Enter rows :4
                        4
                3       4       5
        2       3       4       5       6
1       2       3       4       5       6       7

Enter rows :3
                3
        2       3       4
1       2       3       4       5
 */

import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int num = rows + 1 - i;
            int temp = num;

            //Space
            for(int space = i; space < rows; space++) {

                System.out.print("\t");

            }

            //Data
            for(int j = 0; j < (i*2)-1; j++) {

                System.out.print(temp+"\t");
                temp++;
            }
            System.out.println();
        }
         
        sc.close();
    }
}
