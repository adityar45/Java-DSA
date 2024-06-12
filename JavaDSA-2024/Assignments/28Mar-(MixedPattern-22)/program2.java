/*
Enter rows :4
1       2       3       4
        4       5       6
                6       7
                        7

Enter rows :3
1       2       3
        3       4
                4
 */

import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = 1;

        for(int i = 1; i <= rows; i++) {

            //Spaces
            for(int space = 1; space < i; space++) {

                System.out.print("\t");
            }

            //Data
            for(int j = rows; j >= i; j--) {
                System.out.print(num+"\t");
                num++;
            }
            num--;
            System.out.println();
        }
        sc.close();
    }
}
