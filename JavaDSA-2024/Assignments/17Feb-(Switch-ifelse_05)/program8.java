/*
 8.Write a program in which takes two numbers if both the numbers are positive
multiply them and provide to switch case to verify whether the number is even or
odd, if the user enters any negative number program should terminate by saying
“Sorry negative numbers not allowed
 */

 class program8 {
    public static void main(String[] args) {
        int num1 = 5; 
        int num2 = 3; 
        
        if (num1 < 0 || num2 < 0) {
            System.out.println("Sorry, negative numbers not allowed");
        }
        
        int result = num1 * num2;
        
        switch (result % 2) {
            case 0:
                System.out.println("Result is even.");
                break;
            case 1:
                System.out.println("Result is odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
