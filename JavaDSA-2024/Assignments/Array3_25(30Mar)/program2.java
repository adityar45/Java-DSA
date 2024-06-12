import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find first occurence in an array");
        int num = sc.nextInt();

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == num) {
                System.out.println("\nElement "+arr[i]+" found at index "+i);
                break;
            }
              
        }
        System.out.println();

        sc.close();

    }
}