/*
Enter rows :4
d       5       f       7
8       i       10      k
l       13      n       15
16      q       18      s

Enter rows :3
c       4       e
6       g       8
i       10      k
 */

import java.util.*;

class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int ch1 = rows + 96;
        int num = rows;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {
            

            if(i % 2 == 1)
            {
                if(j % 2 == 1)
                {
                    System.out.print((char)ch1+"\t");
                    ch1++;
                    num++;
                }
                else
                {
                    System.out.print(num+"\t");
                    ch1++;
                    num++;
                }
            }
            else
            {
                if(j % 2 == 0)
                {
                    System.out.print((char)ch1+"\t");
                    ch1++;
                    num++;
                }
                else
                {
                    System.out.print(num+"\t");
                    ch1++;
                    num++;
                }
            }
    }
    System.out.println();
}
sc.close();
}
}
