

import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows :\t");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            int ch = 64 + rows;

            for(int j = 1; j <= rows; j++) {

                if(i % 2 == 1)
                {
                    if(j % 2 == 1)
                    {
                        System.out.print("#"+"\t");
                    }
                    else
                    {
                        System.out.print((char)ch+"\t");
                        ch--;
                    }
                }
                else
                {
                    if(j % 2 == 1)
                    {
                        System.out.print((char)ch+"\t");
                        ch--;
                    }
                    else
                    {
                        System.out.print("#"+"\t");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}