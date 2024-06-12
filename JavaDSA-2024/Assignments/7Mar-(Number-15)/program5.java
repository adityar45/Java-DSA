/*Factorial of a number */

class program5 {
    public static void main(String[] args) {
        
        int num = 5;
        int temp = num;
        int fact = 1;

        System.out.println("The factorial of "+num+" is: ");

        while(temp > 0)
        {
            fact *= temp;
            temp--;
        }

        System.out.println(fact);
    }
}
