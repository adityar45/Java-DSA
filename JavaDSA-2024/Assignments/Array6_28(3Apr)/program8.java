//Write a program to reverse the character array 
//and print the alternate elements before and after reverse
import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        char arr[] = new char[size];
        
        //Input for array
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        //Before reverse alternate
        System.out.println("Before reverse alternate :");
        for(int i=0; i<arr.length; i++) {
            if(i % 2 == 0)
            {
                System.out.println(arr[i]); 
            }
        }

        //Reverse the array
        char temp = 0;

        for(int i=0; i<arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }

        //After reverse alternate
        System.out.println("After reverse alternate :");
        for(int i=0; i<arr.length; i++) {
            if(i % 2 == 0)
            {
                System.out.println(arr[i]); 
            }
        }
    
        sc.close();

    }
}