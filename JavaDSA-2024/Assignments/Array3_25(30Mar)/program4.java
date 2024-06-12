import java.util.*;

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array with even number as 0 and odd number as 1 is :");
        for(int i=0; i<arr.length; i++) {

            if(arr[i] % 2 == 0) {
                arr[i] = 0;
                System.out.println(arr[i]);
            }
            else 
            {
                arr[i] = 1;
                System.out.println(arr[i]);
            }
              
        }
        System.out.println();

        sc.close();

    }
}