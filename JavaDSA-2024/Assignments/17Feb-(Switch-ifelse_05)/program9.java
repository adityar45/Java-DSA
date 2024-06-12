/*
9.Write a program in which students should enter marks for 5 different subjects. If
all subjects have the above passing marks add them and provide a switch case to
print grades(first class with distinction, first class, second class), if a student gets a
fail in any subject program should print “You failed the exam”.
 */

 class program9 {
    public static void main(String[] args) {
        int subject1 = 80; 
        int subject2 = 75; 
        int subject3 = 85;
        int subject4 = 90; 
        int subject5 = 39; 
        
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        
        if (subject1 < 40 || subject2 < 40 || subject3 < 40 || subject4 < 40 || subject5 < 40) {
            System.out.println("You failed the exam");
            return;
        }
        
        switch (totalMarks / 5) {
            case 90:
                System.out.println("First class with distinction");
                break;
            case 80:
                System.out.println("First class");
                break;
            case 70:
                System.out.println("Second class");
                break;
            default:
                System.out.println("Pass");
        }
    }
}
