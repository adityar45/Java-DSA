class program8{
    public static void main(String[] args) {

        int sum = 0;
        int start = 90;
        int end = 11;

        System.out.println("Sum of integers from "+start+" to "+end+" is :");
        while(start >= end)
        {
            sum+=start;
            start--;
        }
        System.out.println(sum);
    }
}