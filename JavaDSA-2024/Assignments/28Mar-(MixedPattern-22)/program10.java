/*
Enter rows :4
                        1
                2       3       2
        3       4       5       4       3
4       5       6       7       6       5       4

Enter rows :3
                1
        2       3       2
3       4       5       4       3
 */

import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int num = i;

            //Space
            for(int space = i; space < rows; space++) {

                System.out.print("\t");

            }

            //Data
            for(int j = 1; j <=(i*2)-1; j++) {

                if(j < i)
                {
                    System.out.print(num+"\t");
                    num++;
                }
                else
                {
                    System.out.print(num+"\t");
                    num--;
                }
            
            }
            System.out.println();
        }
         
        sc.close();
    }
}
