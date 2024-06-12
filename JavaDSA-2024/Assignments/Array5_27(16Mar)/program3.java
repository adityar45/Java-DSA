//Palindrome or Non-Palindrome
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

for (int i = 0; i < arr.length / 2; i++) {

    if (arr[i] != arr[size - i - 1]) {
        System.out.println("Not Palindrome.");
        break;
    }
    else {
        count++;
    }
}

if(count > 0)
{
    System.out.println("Palindrome.");
}
}
}