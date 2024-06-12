/*
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
 */
import java.util.*;

class program1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = 1;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <=rows; j++) {

                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
