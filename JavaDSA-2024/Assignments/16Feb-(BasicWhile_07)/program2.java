class program2{
    public static void main(String[] args) {

        int start = 50;
        int end = 10;

        System.out.println("Number divisible by 5 in the range "+start+" to "+end+" :");
        while(start >= end)
        {
            if(start % 5 == 0)
            {
            System.out.println(start);
            }
            start--;
        }
    }
}