
import java.util.*;

class program4 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter rows :");
       int rows = sc.nextInt();
       
       for(int i = 1; i <= rows; i++) {

           for(int j = rows; j >= i; j--) {

               System.out.print((char)('A' + rows - i - 1));
               //num-=2;
           }
           
           System.out.println();
       }
       sc.close();

   }
}