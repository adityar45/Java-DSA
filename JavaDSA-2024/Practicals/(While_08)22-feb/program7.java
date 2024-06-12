class program7 {
    public static void main(String[] args) {

        int num = 93079224;
        int rem = 0;
        int count = 0;
        System.out.println("Given number is : "+num);

        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            count++;
        }
        System.out.println("Count of digits in a given number is: "+count);
    }
}