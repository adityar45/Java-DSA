
/*
d
D C
d c b
D C B A
 */
import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++) {

            int ch1 = rows+96;
            int ch2 = rows+64;

            for(int j = 0; j <= i; j++) {

                if(i % 2 == 0)
                {
                    
                    System.out.print((char)ch1+" ");
                    ch1--;
                }
                else
                {
                    System.out.print((char)ch2+" ");
                    ch2--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}