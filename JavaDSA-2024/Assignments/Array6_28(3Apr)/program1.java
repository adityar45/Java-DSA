//Descending or not
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

        int flag = 0;
                for(int i=0; i<arr.length-1; i++) {

                if(arr[i] > arr[i+1]) {

                } else {
                    flag++;
                }
        }
        
        if(flag == 0)
        {
            System.out.println("Descending.");
        }
        else
        {
            System.out.println("Not Descending.");
        }

        sc.close();

    }
}