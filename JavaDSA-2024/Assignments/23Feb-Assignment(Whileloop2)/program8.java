class program8 {
    public static void main(String[] args) {

        int num = 2569185;
        int rem = 0;
        int product = 1;

        System.out.println("Given number is : "+num);
        System.out.println("Product of odd digits in a given number is: ");
    
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;

            if(rem % 2 != 0)
            {
                product = product * rem;
            }

        }
        System.out.println(product);
    }
}