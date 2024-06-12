import java.util.*;

class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int product = 1;

        System.out.println("Product of Prime number in an array is :");
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int count = 0;
            
            while(arr[i] > 0)
            {
                if(temp % arr[i] == 0) {
                    count++;
                } 
                arr[i]--;
            }
            if(count < 3)
            {
                product*=temp;
            }
              
        }
        System.out.println(product);

        sc.close();

    }
}