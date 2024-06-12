//tak.e number from user and if the number found in the array then print its cube
import java.util.*;

class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number if found array will store its cube :");
        int num = sc.nextInt();

        System.out.println("Array after conversion is :");
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] == num)
            {
                arr[i] = arr[i] * arr[i] * arr[i];
                System.out.println(arr[i]);
            }
            else
            {
                System.out.println(arr[i]);   
            }
        }

        
        sc.close();

    }
}