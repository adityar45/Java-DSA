//Sum and count of prime numbers
import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int prime_count = 0;

        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int count = 0;
            
            while(arr[i] > 0)
            {
                if(temp % arr[i] == 0) {
                    count++;
                } 
                arr[i]--;
            }
            if(count <  3)
            {
                sum+=temp;
                prime_count++;
            }
        }
        System.out.println("Sum of prime elements is :"+sum);
        System.out.println("Count of prime elements is :"+prime_count);
        sc.close();

    }
}