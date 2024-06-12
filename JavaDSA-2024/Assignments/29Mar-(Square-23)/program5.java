/*
Enter rows :4
4       $       5       $
6       6       6       6
6       $       7       $
8       8       8       8

Enter rows :3
3       $       4
5       5       5
5       $       6
 */

import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        int num = rows;

        for(int i = 1; i <= rows; i++) {    

            for(int j = 1; j <= rows; j++) {
            
            if(i % 2 == 1)
            {
                if(j % 2 == 1)
                {
                    System.out.print(num+"\t");
                    num++;
                }
                else
                {
                    System.out.print("$"+"\t");
                }
            }
            else
            {
                System.out.print(num+"\t");
            }
    }
    System.out.println();
}
sc.close();
}
}
