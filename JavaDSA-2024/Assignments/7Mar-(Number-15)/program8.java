
//Reverse of a number

class program8 {
    public static void main(String[] args) {
        
        int num = 12345;
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
    }
}
