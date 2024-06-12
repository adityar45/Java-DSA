class program8 {
    public static void main(String[] args) {

        float percentage = 85.00f;

        if(percentage >= 75.0)
            System.out.println("Passed : First Class With Distinction : "+percentage);
        else if(percentage >= 65.00 && percentage < 75.0)
            System.out.println("Passed : First Class "+percentage);
        else if(percentage >= 55.00 && percentage < 65.0)
            System.out.println("Passed : Second Class "+percentage);
        else if(percentage >= 47.00 && percentage < 55.0)
            System.out.println("Passed : "+percentage);
        else
            System.out.println("Failed : "+percentage);
    }
}