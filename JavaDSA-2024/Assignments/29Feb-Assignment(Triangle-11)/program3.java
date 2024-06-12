import java.util.*;

class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            int num = rows;
            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}