class program10 {
    public static void main(String[] args) {
        int selection = 3; 
        
        String item;
        
        switch (selection) {
            case 1:
                item = "Coke";
                break;
            case 2:
                item = "Chips";
                break;
            case 3:
                item = "Chocolate";
                break;
            case 4:
                item = "Water";
                break;
            case 5:
                item = "Sandwich";
                break;
            default:
                item = "Invalid selection";
        }
        
        System.out.println("You have selected: " + item);
    }
}
