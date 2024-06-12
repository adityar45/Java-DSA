import java.util.*;

class program11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++) {
            int ch = rows+64;
            for(int j = rows; j >= i; j--) {
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}