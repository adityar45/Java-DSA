import java.util.*;

class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int count = 0;
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even Array elements are : ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("\nCount of even elements in array :"+count);

        sc.close();

    }
}