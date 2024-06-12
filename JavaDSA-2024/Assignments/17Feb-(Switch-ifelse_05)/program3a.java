class program3 {
    public static void main(String[] args) {
        String size = "XL";
        
        if (size.equals("S")) {
            System.out.println("Small");
        } else if (size.equals("M")) {
            System.out.println("Medium");
        } else if (size.equals("L")) {
            System.out.println("Large");
        } else if (size.equals("XL")) {
            System.out.println("Extra Large");
        } else if (size.equals("XXL")) {
            System.out.println("Double Extra Large");
        } else {
            System.out.println("Invalid size.");
        }
    }
}
