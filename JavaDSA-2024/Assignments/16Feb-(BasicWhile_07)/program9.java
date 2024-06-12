class program9{
    public static void main(String[] args) {

        int sum = 0;
        int start = 150;
        int end = 101;

        System.out.println("Sum of odd integers from "+start+" to "+end+" is :");
        while(start >= end)
        {
            if(start % 2 == 1)
            {
                sum+=start;
            }
            start--;
        }
        System.out.println(sum);
    }
}