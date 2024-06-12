/*Factors of a number */

class program1 {
    public static void main(String[] args) {
        
        int num = 2;
        int temp = num;

        System.out.println("The factor of "+num+" are : ");

        while(temp > 0)
        {
            if(num % temp == 0)
            {
                System.out.println(temp);
            }
            temp--;
        }
    }
}