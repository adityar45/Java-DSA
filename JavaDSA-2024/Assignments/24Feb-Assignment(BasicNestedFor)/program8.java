class program8 {
    public static void main(String[] args) {

        int rows = 27;
        char ch = '@';
        int num = 1;
        int div;
        ch+=rows;
        System.out.println("ch :"+ch);
        if (ch > 'Z') {
            div = (ch - 'A') % 26; // Calculate the offset from 'A' after reaching 'Z'
            System.out.println("div: " + div);
            ch = (char)('A' + div); // Reset ch to 'A' plus the offset
        }
        System.out.println("ch :"+ch);

        // if(ch > 'Z')
        // {
        //     div = ch % 26;
        //     System.out.println("div :"+div);
        //     ch+=div;
        // }
       
        for(int i = 1; i <= rows; i++) {
            
            for(int j = 1; j <= rows; j++) {
                System.out.print(ch+""+num+" ");
                num++;
            }
        
        System.out.println();
        }

    }
}