//Replace with '#' wich are not in the range of a to z
import java.util.*;

class program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        char arr[] = new char[size];

        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for(int i=0; i<arr.length; i++) {
            if((int)(arr[i]) >= 97 && (int)arr[i] <= 122) {
              
            }
            else {
                arr[i] = '#';
            }
        }

        System.out.println("Array after replacing with '#' which are not in range of a to z is :");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}