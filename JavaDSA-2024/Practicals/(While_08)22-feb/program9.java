class program9 {
    public static void main(String[] args) {

        int num = 214367689;
        int rem = 0;
        int even_count = 0;
        int odd_count = 0;
        System.out.println("Given number is :"+num);
        
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            if(rem % 2 == 0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
        }

        System.out.println("Number of even digits in number is :"+even_count);
        System.out.println("Number of odd digits in number is :"+odd_count);

    }
}