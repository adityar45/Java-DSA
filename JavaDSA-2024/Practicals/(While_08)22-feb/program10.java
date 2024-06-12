class program10 {
    public static void main(String[] args) {

        long num = 9307922405l;
        long rem = 0;
        int sum = 0;
        System.out.println("Given number is :"+num);

        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            
            sum += rem;
        }
        System.out.println("Sum of digits in a given number is :"+sum);

    }
}