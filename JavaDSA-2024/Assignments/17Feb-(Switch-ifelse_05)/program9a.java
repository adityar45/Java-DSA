class program9a {
    public static void main(String[] args) {
        int subject1 = 80; 
        int subject2 = 75; 
        int subject3 = 85;
        int subject4 = 90; 
        int subject5 = 39; 
        
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        
        if (subject1 < 40 || subject2 < 40 || subject3 < 40 || subject4 < 40 || subject5 < 40) {
            System.out.println("You failed the exam");
        } else {
            int averageMarks = totalMarks / 5;
            
            if (averageMarks >= 90) {
                System.out.println("First class with distinction");
            } else if (averageMarks >= 80) {
                System.out.println("First class");
            } else if (averageMarks >= 70) {
                System.out.println("Second class");
            } else {
                System.out.println("Pass");
            }
        }
    }
}
