//merge two array with different sizes
//to take two different 1d arrays of the same size and print the
//common elements from the arrays.
import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of 1st array :");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];

        System.out.println("Enter the size of 2nd array :");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        
        System.out.println("Enter first "+size1+" array elements : ");
        for(int i=0; i<arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second "+size2+" array elements : ");
        for(int i=0; i<arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[size1+size2];

        //Copying arr1 to arr3
        for(int i=0; i<arr1.length; i++) {   
         arr3[i] = arr1[i];
        }

        //Copying arr2 to arr3 
        for(int i=arr1.length, j = 0; i<arr3.length; i++,j++) {   
            arr3[i] = arr2[j];
        }

        //Printing array
        System.out.println("Merged Array is :");
        for(int i=0; i<arr3.length; i++) {   
            System.out.println(arr3[i]);
           }

        sc.close();

    }
}

/*
 *    // Copy elements of array1 to combinedArray
        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }

        // Copy elements of array2 to combinedArray
        for (int i = 0; i < array2.length; i++) {
            combinedArray[array1.length + i] = array2[i];
        }
 */