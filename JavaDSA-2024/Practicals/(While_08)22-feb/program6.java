class program6 {
    public static void main(String[] args) {

        int num = 9307;
        int rem = 0;
        System.out.println("Digits in a given number "+num+" are as follows:");
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            System.out.println(rem);
        }
    }
}