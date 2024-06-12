import java.util.*;

class program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        char arr[] = new char[size];

        System.out.println("Enter "+size+" array elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("List of consonants in an array : ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
            arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
            
            }
            else {
                System.out.println("Consonant found at index "+i+" is "+arr[i]);
            }
        }
        System.out.println();

        sc.close();
    }
}