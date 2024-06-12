class program10 {
    public static void main(String[] args) {

        int rows = 5;
        int num = 1;

        for(int i = 1; i <= rows; i++) {
            
            for(int j = 1; j <= rows; j++) {

                System.out.print(num+" ");
                num++;
            }
            num=i+1;
        
        System.out.println();
        }

    }
}