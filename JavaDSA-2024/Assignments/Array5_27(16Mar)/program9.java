//to take a number from the user and store each element in an array by increasing
//the element by one.
import java.util.*;

class program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take a number from user
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int temp = num;
        int digit = 0;

        //counting digits in a number
        while(temp > 0)
        {
            digit++;
            temp/=10;
        }

        //creating array of count of digits
        int arr[] = new int[digit];

        //Storing elements
        for(int i = digit-1; i >= 0; i--) {
                int rem = 0;
                rem = num % 10;
                arr[i] = (rem + 1) % 10;
                num = num / 10;
        }

        //Printing the array
        System.out.println("Array of the number elements after adding 1 to each digit");
        for(int i = 0; i < digit; i++) {
          System.out.println(arr[i]);
        }
        
        sc.close();
    }
}
