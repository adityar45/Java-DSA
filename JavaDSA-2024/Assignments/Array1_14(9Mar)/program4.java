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

        System.out.println("Odd Array elements are : ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 1) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        sc.close();
    }
}