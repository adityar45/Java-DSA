/*
1
2 a
3 b 3
4 c 4 d
 */
import java.util.*;

class program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        int num = 1;
        char ch = 'a';

        for(int i = 0; i < rows; i++) {

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
            }
            num++;
            System.out.println();
        }
        sc.close();
    }
}
