//Difference between min and maximun in an array

import java.util.*;

class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int diff = 0;

        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Max
        int max = arr[0];

       
        for(int i=0; i<arr.length; i++) {
             if(arr[i] > max) {
                 max = arr[i];
             }
         }

        //Min
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[0];
            }
        }

        diff = max - min;
        System.out.println("Difference between max "+max+" and "+min+" min element in the array is : "+diff);

        sc.close();
    }
}