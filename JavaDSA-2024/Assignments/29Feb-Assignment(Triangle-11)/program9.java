import java.util.*;

class program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++) {
            int num = 1;
            for(int j = rows; j >= i; j--) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}