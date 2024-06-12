/*
1.Write a program to check whether the given number is odd or even.
Input : 45
Output : 45 is an odd number.
Input : 28
Output : 28 is an even number.
 */

 class program1a {
    public static void main(String[] args) {
        int num = 25;
        
        if(num % 2 == 0) {
                System.out.println(num + " is even.");
        }
        else if(num % 2 == 1) {
                System.out.println(num + " is odd.");
        }
        else {
                System.out.println("Invalid input.");
        }
    }
 }
