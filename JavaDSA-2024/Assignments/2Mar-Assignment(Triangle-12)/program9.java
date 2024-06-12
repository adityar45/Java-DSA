/*
5
5 a
5 b 7
5 c 7 d
 */
import java.util.*;

class program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        char ch = 'a';

        for(int i = 0; i < rows; i++) {

            int num = rows+1;

            for(int j = 0; j <= i; j++) {

                if(j % 2 == 0)
                {
                    System.out.print(num+" ");
                }
                else
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                num++;
            }
            
            System.out.println();
        }
        sc.close();
    }
}