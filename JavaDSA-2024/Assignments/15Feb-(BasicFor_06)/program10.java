class program10 {
    public static void main(String[] args) {

        int product = 1;
        System.out.println("Product of first 10 natural numbers :");

        for(int i=1; i <= 10; i++) {
            product*=i;
        }
        System.out.println(product);
    }
}