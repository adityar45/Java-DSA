//to print the factorial of each element in an array.
import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Factorial of elements are :");
        for(int i=0; i<arr.length; i++) {
5
            int fact = 1;
            while(arr[i] > 0) 
            {
                 fact=fact*arr[i];
                 arr[i]--;
            }
            System.out.println(fact);
        }

        sc.close();
    }
}