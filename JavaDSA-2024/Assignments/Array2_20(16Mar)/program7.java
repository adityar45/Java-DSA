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

        if(size % 2 == 0)
        {
            System.out.println("\nArray size is even so alternate elements are :");
            for(int i=0; i<arr.length; i++) {

               if(i % 2 == 0) {
                System.out.println(arr[i]);
               }
            }
        }
        else 
        {
            System.out.println("\nArray size is odd so all elements are :");
            for(int i=0; i<arr.length; i++) {
                System.out.println(arr[i]);
            }

        }

        sc.close();

    }
}