


import java.util.*;

class program10 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();

       for(int i = rows; i >= 1; i--) {

        int ch1 = i + 64;
        int ch2 = i + 96;

           for(int j = 1; j <= i; j++) {

               if(i % 2 == 0)
               {
                System.out.print((char)ch1+" ");
                ch1--;
               }
               else
               {
                System.out.print((char)ch2+" ");
                ch2--;
               }
           }
           
           System.out.println();
       }

       sc.close();
   }

}