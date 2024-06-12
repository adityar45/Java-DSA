//Second minimun in an array
import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //First Min
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
             if(arr[i] < min) {
                 min = arr[i];
             }
        }

        //Second Max
        int min2 = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] <= min2 && arr[i] > min )
            {
                min2 = arr[i];
            }
        }

        System.out.println("Second minimal element in the array is : "+min2);

        sc.close();
    }
}