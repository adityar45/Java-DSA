//Print number of digits in elements of an array.
import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The digits in a element of array respectively :");
        for(int i=0; i<arr.length; i++) {
            int digit = 0;
            int temp = arr[i];

            while(temp > 0)
            {
                int rem = temp % 10;
                digit++;
                temp/=10;
            }
            System.out.println(digit);

        }
        sc.close();

    }
}