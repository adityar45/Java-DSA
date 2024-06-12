class program9 {
    public static void main(String[] args) {

        int num = 2469185;
        int rem = 0;
        int sum_squ_odd = 1;
        int square = 0;

        System.out.println("Given number is : "+num);
        System.out.println("Sum of squares of odd digits in a given number is: ");
    
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;

            if(rem % 2 != 0)
            {
                square = rem * rem;
                sum_squ_odd = sum_squ_odd + square;
            }

        }
        System.out.println(sum_squ_odd);
    }
}