class program7a {
    public static void main(String[] args) {
        int budget = 15000;
        
        String destination;
        
        if (budget == 15000) {
            destination = "Jammu and Kashmir";
        } else if (budget == 10000) {
            destination = "Manali";
        } else if (budget == 6000) {
            destination = "Amritsar";
        } else if (budget == 2000) {
            destination = "Mahabaleshwar";
        } else {
            destination = "Better luck next time";
        }
        
        System.out.println("Based on the budget, the destination is: " + destination);
    }
}
