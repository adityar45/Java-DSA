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

        System.out.println("Adding 15 to each Array elements : ");
        for(int i=0; i<arr.length; i++) {

                System.out.println(arr[i]+15+" ");
              
        }
        System.out.println();

        sc.close();

    }
}