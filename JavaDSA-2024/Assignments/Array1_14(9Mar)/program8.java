import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee count :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" employee's age : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Age of the empolyee's are : ");
        for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        sc.close();
    }
}