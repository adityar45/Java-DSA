import java.util.*;

class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println("Enter the number you want to find occurence in an array");
        int num = sc.nextInt();

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == num) {
                System.out.println("Element "+arr[i]+" found at index "+i);
                count++;
            }
              
        }

        System.out.println("The number "+num+" occurred "+count+" times in array.");

        sc.close();

    }
}