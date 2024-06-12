class program8 {
    public static void main(String[] args) {
        int num1 = 5; 
        int num2 = 3; 
        
        if (num1 < 0 || num2 < 0) {
            System.out.println("Sorry, negative numbers not allowed");
        } else {
            int result = num1 * num2;
            
            if (result % 2 == 0) {
                System.out.println("Result is even.");
            } else {
                System.out.println("Result is odd.");
            }
        }
    }
}
