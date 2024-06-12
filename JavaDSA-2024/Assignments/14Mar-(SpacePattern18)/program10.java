
import java.util.*;

class program10 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter rows : ");
    int rows = sc.nextInt();

    for(int i = 1; i <= rows; i++) {

      int ch = 64;

      //Spaces
      for(int space = 1; space <= i; space++) {
        System.out.print("\t");
        ch++;
      }

      for(int j = 1; j <= rows - i + 1; j++) {

        if(rows %2 ==0){
						
          if((j+i)%2!=0){

            System.out.print((char)ch+"\t");

          }else{
        
            System.out.print(ch+"\t");

          }
          ch++;
        }
        else
        {
        
          if((j+i)%2==0){

          System.out.print((char)ch+"\t");

          }else{
        
          System.out.print(ch+"\t");

          }
          ch++;
        }
       
      }
      System.out.println();
    }
    sc.close();
  }
}

 






