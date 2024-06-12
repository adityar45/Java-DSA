import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int sum = 0;

        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of Array elements divisible by 3 is : ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 3 == 0) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);

        sc.close();
    }
}