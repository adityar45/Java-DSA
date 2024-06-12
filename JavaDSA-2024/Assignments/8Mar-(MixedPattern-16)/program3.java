/*
D C B A
1 2 3 4
D C B A
1 2 3 4

C B A
1 2 3
C B A
 */


import java.util.*;

class program3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :");
        int rows = sc.nextInt();


        for(int i = 0; i < rows; i++) {

            int num = 1;   //to count num
            int ch = rows + 64;

            for(int j = 0; j < rows ; j++) {

            if(i % 2 == 0)
            {
                System.out.print((char)ch+"\t");
                ch--;
            }
            else
            {
                System.out.print(num+"\t");
                num++;
            }
        }

            System.out.println();
        }
        sc.close();
    }
}