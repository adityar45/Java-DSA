//Write a program to check whether the array contains element multiple of
//user given int value, if yes then print it’s index.
import java.util.*;

class program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number to find its multiple in array :");
        int num = sc.nextInt();

        System.out.println("Array :");
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] % num == 0)
            {
                System.out.println("Element "+arr[i]+" found at index"+i+" is multiple of "+num);
            }
        }
        sc.close();

    }
}