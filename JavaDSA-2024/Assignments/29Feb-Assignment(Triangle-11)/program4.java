import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++) {
            int ch = i+64;
            for(int j = 1; j <= i; j++) {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}