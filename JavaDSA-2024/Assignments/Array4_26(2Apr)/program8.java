//Count of occurrence of a char in array
import java.util.*;

class program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        char arr[] = new char[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        int count = 0;

        System.out.println("Enter the character you want to find occurence in an array");
        char ch = sc.next().charAt(0);

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == ch) {
                System.out.println("Element "+arr[i]+" found at index "+i);
                count++;
            }
              
        }

        System.out.println("The character "+ch+" occurred "+count+" times in array.");

        sc.close();

    }
}