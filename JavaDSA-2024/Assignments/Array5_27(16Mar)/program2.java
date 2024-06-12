//print sum of odd and even elements
import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int odd_sum = 0;
        int even_sum = 0;

        for(int i=0; i<arr.length; i++) {

        if(arr[i] % 2 == 1) {
            odd_sum+=arr[i];
        } else {
            even_sum+=arr[i];
        }
    }
    
    
        System.out.println("Even sum :"+even_sum);
        System.out.println("Odd sum :"+odd_sum);
    

        sc.close();

    }
}