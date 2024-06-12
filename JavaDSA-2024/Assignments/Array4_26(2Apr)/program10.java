//print the characters in an array which comes before the user entered character
import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        char arr[] = new char[size];

        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Enter a character ");
        char ch = sc.next().charAt(0);

        System.out.println("Array of character which comes before "+ch+" is :");
        for(int i=0; i<arr.length; i++) {
            if((int)(arr[i]) < ch) {
              System.out.println(arr[i]);
            }
            else {

            }
        }


        sc.close();
    }
}