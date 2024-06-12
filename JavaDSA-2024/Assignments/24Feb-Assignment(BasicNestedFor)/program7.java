class program7 {
    public static void main(String[] args) {

        int rows = 28;
        char ch = '`'; //96-ASCII value (a-z -> 97-122)
        //int div;
        //ch+=rows;

        System.out.println("ch :"+(int)ch);

        // if (ch > 'z') {
        //     div = (ch - 'a') % 26; // Calculate the offset from 'A' after reaching 'Z'
        //     System.out.println("div: " + div);
        //     ch = (char)('a' + div); // Reset ch to 'A' plus the offset
        // }

        System.out.println("ch :"+ch);

        char temp = ch;
       
        for(int i = 1; i <= rows; i++) {
            
            for(int j = 1; j <= rows; j++) {

                if(ch < 'a')
                {
                    ch = 'z';
                }
                System.out.print(ch+" ");
                ch--;
            }
        ch = temp;
        System.out.println();
        }

    }
}