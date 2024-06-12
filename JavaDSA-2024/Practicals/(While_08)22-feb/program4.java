class program4 {
    public static void main(String[] args) {

        char ch = 'A';
        int num = 2;

        for(int start = 1 ; start <= 6; start++)
        {
            if(start % 2 != 0)
            {
                System.out.print(ch+" ");
                ch+=2;
            }
            else
            {
                System.out.print(num+" ");
                num+=2;

            }
        }
    }
}