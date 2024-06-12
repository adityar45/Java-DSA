class program9{
    public static void main(String[] args) {

        int sum = 0;
        int start = 100;
        int end = 24;

        System.out.println("Numbers in the range "+start+" to "+end+" which are divisible by 4 and 5 are :");
        while(start >= end)
        {
            if(start % 4 == 0 && start % 5 == 0)
            {
                System.out.println(start);
            }
            start--;
        }
    }
}