//9.WAP to calculate count of palindrome element in an array.
import java.util.*;

class program9 {
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

        for(int i=0; i<arr.length; i++) {

            int rev = 0;
            int rem = 0;
            int temp = arr[i];
    
            //Reverse the element
            while(arr[i] > 0)
            {
                rem = arr[i] % 10;
                rev = rem + (rev * 10);
                arr[i] /= 10;
            }

            if(temp == rev)
            {
                count++;
            }
        }
        System.out.println("Count of palindrome elements is :"+count);
        sc.close();

    }
}