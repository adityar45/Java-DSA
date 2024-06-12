//to take two different 1d arrays of the same size and print the
//common elements from the arrays.
import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size];
        
        System.out.println("Enter first "+size+" array elements : ");
        for(int i=0; i<arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second "+size+" array elements : ");
        for(int i=0; i<arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Common elements are:");
        for(int i=0; i<arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                    //break;
                }
         }     
         
        }
        sc.close();

    }
}