/*
                        1
                1       1       1
        1       1       1       1       1
1       1       1       1       1       1       1
 */
import java.util.*;

class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++)
        {

            //Spaces
            for(int space = rows; space > i; space--) 
            {
                System.out.print("\t");
            }

            //Printing data
            for(int j = 1; j <= (i*2)-1; j++) {

                System.out.print("1\t");
            }
            System.out.println();
        }
        sc.close();

    }
    
}