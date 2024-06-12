import java.util.*;

class program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int Product = 1;
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Product of odd index Array elements is : ");
        for(int i=0; i<arr.length; i++) {
            if(i % 2 == 1) {
                Product*=arr[i];
            }
        }
        System.out.println(Product);

        sc.close();

    }
}