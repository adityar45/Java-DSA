class program8 {
    public static void main(String[] args) {

        int num = 9307;
        int rem = 0;
        System.out.println("Given number is : "+num);
        System.out.println("Odd digits in the given number are: ");

        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            if(rem % 2 != 0)
            {
                System.out.println(rem);
            }
        }
    }
}