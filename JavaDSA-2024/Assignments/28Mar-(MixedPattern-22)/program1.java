/*
Enter rows :4
                        1
                3       5
        7       9       11
13      15      17      19

Enter rows :3
                1
        3       5
7       9       11
 */
import java.util.*;

class program1 {
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
                num+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}