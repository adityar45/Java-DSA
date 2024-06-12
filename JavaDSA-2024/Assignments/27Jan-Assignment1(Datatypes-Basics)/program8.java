class program8 {
    public static void main(String[] args) {
      
        int marksObtained = 465;
        int totalMarks = 500;
        char grade = 'O';
        
        double percentage = (double) marksObtained / totalMarks * 100;
        
        System.out.println("Percentage: " + percentage + "%");

        System.out.println("Grade: "+grade);
}
}