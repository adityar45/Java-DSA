class program1{
    public static void main(String[] args) {

        int start = 90;
        int end = 65;

        while(start >= end)
        {
            System.out.println("ASCII char of "+start+" is "+(char)start);
            start--;
        }
    }
}