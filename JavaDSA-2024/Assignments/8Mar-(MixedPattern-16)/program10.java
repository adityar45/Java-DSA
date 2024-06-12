/*
Write a program to print the square of odd digits from the given
number. (First reverse this number and then perform the operation)

Input : 45632985632
Output : 25, 9, 81, 25, 9
 */


class program10 {
    public static void main(String[] args) {
        
        int num = 78652;
        int rem = 0;
        int rev = 0;

        System.out.println("\nThe square of odd digits in a number " +num+" are :");

        
        while(num > 0)
        {
            rem = num % 10;
            rev = rem + (rev * 10);
            num = num / 10;
        }

        while(rev > 0)
        {
            rem = rev % 10;

            if(rem % 2 == 1)
            {
                System.out.print(rem*rem+", ");
            }

            rev = rev / 10;
        }
        System.out.println();
    }
}

