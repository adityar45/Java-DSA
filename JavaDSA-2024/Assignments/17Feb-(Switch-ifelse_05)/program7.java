/*
7.Write a program for the below example.
If you are a trip planner and you are planning a trip according to the budget of
client
1. For budget 15000 destination is Jammu and Kashmir
2. For budget 10000 destination is Manali
3. For budget 6000 destination is Amritsar
4. For budget 2000 destination is Mahabaleshwar
5. For Other budgets try next time
 */

 class program7 {
    public static void main(String[] args) {
        int budget = 15000; 
        
        String destination;
        
        switch (budget) {
            case 15000:
                destination = "Jammu and Kashmir";
                break;
            case 10000:
                destination = "Manali";
                break;
            case 6000:
                destination = "Amritsar";
                break;
            case 2000:
                destination = "Mahabaleshwar";
                break;
            default:
                destination = "Better luck next time";
        }
        
        System.out.println("Based on the budget, the destination is: " + destination);
    }
}
