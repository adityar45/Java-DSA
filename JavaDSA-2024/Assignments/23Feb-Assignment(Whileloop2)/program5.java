class program5 {
    public static void main(String[] args) {

        int num = 2569185;
        int rem = 0;

        System.out.println("Given number is : "+num);
        System.out.println("Cube of even digits of a given number are: ");
    
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;

            if(rem % 2 == 0)
            {
            System.out.print(rem*rem*rem+" ");
            }
        }
        System.out.println();
    }
}