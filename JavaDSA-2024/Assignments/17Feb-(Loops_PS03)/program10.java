class program10 {
    public static void main(String[] args) {
        
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        System.out.println("Printing schedule using for loop:");
        
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("Day " + (i+1) + ": " + daysOfWeek[i]);
        }
        
        System.out.println("\nPrinting schedule using while loop:");
        
        int day = 0;
        while (day < daysOfWeek.length) {
            System.out.println("Day " + (day+1) + ": " + daysOfWeek[day]);
            day++;
        }
    }
}
