import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();
        int num = 1;
        
        for(int i = 1; i <= rows; i++) {
            num = i;
            for(int j = rows; j >= i; j--) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}