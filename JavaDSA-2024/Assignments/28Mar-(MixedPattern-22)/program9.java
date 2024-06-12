/*
Enter rows :4
                        4
                5       4       3
        6       5       4       3       2
7       6       5       4       3       2       1

Enter rows :3
                3
        4       3       2
5       4       3       2       1
 */
import java.util.*;

class program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int num = rows - 1 + i;
            int temp = num;

            //Space
            for(int space = i; space < rows; space++) {

                System.out.print("\t");

            }

            //Data
            for(int j = 0; j < (i*2)-1; j++) {

                System.out.print(temp+"\t");
                temp--;
            }
            System.out.println();
        }
         
        sc.close();
    }
}