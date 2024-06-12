class program8 {
    public static void main(String[] args) {

        int num = 9367924;
        int rem = 0;
        int sum_odd = 0;
        int product_even = 1;

        System.out.println("Given number is : "+num);
    
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;

            if(rem % 2 == 0)
            {
                product_even = product_even * rem;
            }
            else
            {
                sum_odd = sum_odd + rem;
            }
        }
        System.out.println("Product of even digits in a number is : "+product_even);
        System.out.println("Sum of odd digits in a given number is : "+sum_odd);
    }
}