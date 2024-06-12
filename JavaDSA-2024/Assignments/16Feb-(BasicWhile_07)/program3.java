class program3{
    public static void main(String[] args) {

        int start = 50;
        int end = 100;

        System.out.println("Number divisible by 4 and 7 in the range "+start+" to "+end+" :");
        while(start <= end)
        {
            if(start % 4 == 0 && start % 7 == 0) 
            {
            System.out.println(start);
            }
            start++;
        }
    }
}