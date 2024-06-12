class program4 {
    public static void main(String[] args) {

        float percentage = 85.00f;

        if(percentage > 85.0)
            System.out.println("Medical field is preferable for percentage: "+percentage);
        else if(percentage > 75.00 && percentage <= 85.0)
            System.out.println("Engineering field is preferable for percentage: "+percentage);
        else if(percentage > 65.00 && percentage <= 75.0)
            System.out.println("Pharmacy or bachelor in science field is preferable for percentage: "+percentage);
        else 
            System.out.println("Not sufficient percentage");
    }
}