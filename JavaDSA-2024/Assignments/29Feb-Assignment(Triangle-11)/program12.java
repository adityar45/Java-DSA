import java.util.*;

class program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++) {
            int ch = i+64;
            for(int j = rows; j >= i; j--) {

                if((i+j) % 2 == 0)
                {
                    System.out.print((char)ch+" ");
                    ch++;
                }
                else
                {
                    System.out.print(ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}