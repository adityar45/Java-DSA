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

        System.out.println("Array elements divisible by 4 are : ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 4 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        sc.close();
    }
}