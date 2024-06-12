//Times of occurrence of an element
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

        System.out.println("Enter a number to find its occurence in an array :");
        int num = sc.nextInt();

        int count = 0;
    
        for(int i=0; i<arr.length; i++) {

            if(arr[i] == num)
            {
                count++;
            }
              
        }

        if(count == 2)
        {
            System.out.println("Number "+num+" occurred "+count+" times.");
        }
        else if(count > 2) {
            System.out.println("Number "+num+" occurred more than 2 times i.e "+count+" times.");
        }
        else {
            System.out.println("Number not found or appeared only once.");
        }

        sc.close();

    }
}