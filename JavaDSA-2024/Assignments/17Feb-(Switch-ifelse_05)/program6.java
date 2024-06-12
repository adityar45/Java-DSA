/*
 6.Write a program that takes a number from 0 to 5 and print its spelling, if the
entered number is greater than 5 print entered number is greater than 5.
Input : 3
Output : Three
Input : 6
Output : 6 is greater than 5.
 */

class program6 {
    public static void main(String[] args) {

        int number = 6; 
        
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println(number + " is greater than 5");
        }
    }
}
