//Find first duplicate of an array and return its index.
import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        boolean flag = false;
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            for(int j = i+1; j <arr.length; j++) {

                if(arr[i] == arr[j]) 
                {
                    System.out.println("Duplicate element found at index "+i+" is : "+arr[i]);
                    flag = true;
                    break;
                }
            }
            if(flag == true)
            {
                break;
            }
        }
        sc.close();

    }
}