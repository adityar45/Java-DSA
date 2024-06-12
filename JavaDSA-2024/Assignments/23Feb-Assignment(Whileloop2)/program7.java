class program7 {
    public static void main(String[] args) {

        int num = 2569185;
        int rem = 0;
        int sum = 0;

        System.out.println("Given number is : "+num);
        System.out.println("Sum of even digits in a given number is: ");
    
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;

            if(rem % 2 == 0)
            {
                sum = sum + rem;
            }

        }
        System.out.println(sum);
    }
}