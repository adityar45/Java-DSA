//Write a program to find the third largest element in an array.
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

        //First Max
        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
             if(arr[i] > max) {
                 max = arr[i];
             }
        }
        System.out.println("First largest element in the array is : "+max);

        //Second Max
        int max2 = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max2 && arr[i] < max )
            {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest element in the array is : "+max2);

        //Third Max
        int max3 = arr[0];
        for(int i = 0; i<arr.length; i++) {
             if(arr[i] > max3 && arr[i] < max2)
             {
                 max3 = arr[i];
             } 
        }
        System.out.println("Third largest element in the array is : "+max3);

        sc.close();
    }
}