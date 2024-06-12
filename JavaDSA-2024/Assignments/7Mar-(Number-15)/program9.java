//Palindrome or not

class program9 {
    public static void main(String[] args) {
        
        int num = 121;
        int temp = num;
        int rem = 0;
        int rev = 0;

        System.out.println("The reverse of a number " +num+" is :");

        while(num > 0)
        {
            rem = num % 10;
            rev = rem + (rev * 10);
            num = num / 10;
        }

        System.out.println(rev);

        if(temp == rev)
        {
            System.out.println("The number "+temp+" is palindrome !");
        }
        else
        {
            System.out.println("The number "+temp+" is not palindrome !");
        }
    }
}
