/*
Enter rows :4
                        1
                5       9
        13      17      21
25      29      33      37

Enter rows :3
                1
        4       7
10      13      16
 */
import java.util.*;

class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = 1;

        for(int i = 1; i <= rows; i++) {

            //Spaces
            for(int space = i; space < rows; space++) {

                System.out.print("\t");
            }

            //Data
            for(int j = 1; j <= i; j++) {
                System.out.print(num+"\t");
                num+=rows;
            }
            System.out.println();
        }
        sc.close();
    }
}