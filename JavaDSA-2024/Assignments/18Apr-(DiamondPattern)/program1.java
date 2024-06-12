/*
                1
        1       1       1
1       1       1       1       1
        1       1       1
                1
 */

 import java.util.*;

 class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();
        
        int col = 0;
        int space = 0;

        for(int i = 1; i <= rows*2 - 1; i++ ) {

            //Space
            if(i <= rows)
            {
                space = rows - i;
            }
            else
            {
                space = i - rows;
            }

            for(int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }

            //Printing data
            if(i <= rows)
            {
                col = i*2 -1;
            }
            else
            {
                col = col - 2; 
            }

            for(int j = 1; j<= col; j++) {
                System.out.print("1\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
