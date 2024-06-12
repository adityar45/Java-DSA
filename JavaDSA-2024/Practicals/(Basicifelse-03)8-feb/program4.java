class program4 {
    public static void main(String[] args) {

        char ch = 'a';

        if(ch >= 65 && ch <= 90) {
            System.out.println("Upper case");
        }
        else if(ch >= 97 && ch <= 122){
            System.out.println("Lower case");
        }
        else {
            System.out.println("Not a valid entry");
        }
    }
}
