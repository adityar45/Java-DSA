/*
Enter rows :    4
4       C       2       A
D       C       B       A
4       C       2       A
D       C       B       A

Enter rows :    3
#       C       #
C       #       B
#       C       #
 */
import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :\t");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int num = rows;

            int ch = 64 + rows;

            for(int j = 1; j <= rows; j++) {

                if(i % 2 == 1)
                {
                    if(j % 2 == 1)
                    {
                        System.out.print(num+"\t");
                        num--;
                        ch--;
                    }
                    else
                    {
                        System.out.print((char)ch+"\t");
                        ch--;
                        num--;
                    }
                }
                else
                {
                    System.out.print((char)ch+"\t");
                    ch--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}