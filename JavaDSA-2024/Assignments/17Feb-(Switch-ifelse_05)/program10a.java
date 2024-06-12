class program10a {
    public static void main(String[] args) {
        int selection = 3; 
        
        String item;
        
        if (selection == 1) {
            item = "Coke";
        } else if (selection == 2) {
            item = "Chips";
        } else if (selection == 3) {
            item = "Chocolate";
        } else if (selection == 4) {
            item = "Water";
        } else if (selection == 5) {
            item = "Sandwich";
        } else {
            item = "Invalid selection";
        }
        
        System.out.println("You have selected: " + item);
    }
}
