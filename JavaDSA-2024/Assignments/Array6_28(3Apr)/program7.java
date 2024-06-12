//Write a program to  take integer number as input and if the number lies in A to Z's ASCII values
//typecast the integer to its character value i.e from A to Z only.
//tak.e number from user and if the number found in the array then print its cube
import java.util.*;

class program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after conversion for 65 to 90 ASCII to A to Z :");
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] >= 65 && arr[i] <= 90)
            {
                System.out.println((char)arr[i]);
            }
            else
            {
                System.out.println(arr[i]);
            }
        }
        
        sc.close();

    }
}