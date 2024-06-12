/*
Enter rows :4
15      f       35      h
i       j       k       l
143     n       195     p
q       r       s       t

Enter rows :3
8       e       24
g       h       i
80      k       120
 */

import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = rows;
        int ch = rows + 97;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= rows; j++) {
            

            if(i % 2 == 1)
            {
                if(j % 2 == 1)
                {
                    System.out.print((num*num)-1+"\t");
                    num++;
                    ch++;
                }
                else
                {
                    System.out.print((char)ch+"\t");
                    num++;
                    ch++;
                }
            }
            else
            {
                System.out.print((char)ch+"\t");
                num++;
                ch++;
            }
    }
    System.out.println();
}
sc.close();
}
}
