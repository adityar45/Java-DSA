//Reverse an array
import java.util.*;

class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Size of an array
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        //User input for array
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Reversing an array
        int temp = 0;

        for(int i=0; i<arr.length/2; i++) {
            temp = arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i] = temp;
        }
        
        //Printing reverse array
        System.out.println("Reverse of above Array  is : ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println();

        sc.close();

    }
}