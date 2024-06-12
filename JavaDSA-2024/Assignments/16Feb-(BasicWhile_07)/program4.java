class program4{
    public static void main(String[] args) {

        int start = 10;
        int end = 1;

        System.out.println("Square of first 10 natural numbers in reverse order:");
        while(start >= end)
        {
            System.out.println(start*start);
            start--;
        }
    }
}