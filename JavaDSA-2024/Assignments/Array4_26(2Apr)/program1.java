//Average of all elements
import java.util.*;

class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int average = 0;
        System.out.println("Average of Array elements is : ");
        for(int i=0; i<arr.length; i++) {

                sum+=arr[i];
              
        }
        average = sum / size;
        System.out.println(average);

        sc.close();

    }
}