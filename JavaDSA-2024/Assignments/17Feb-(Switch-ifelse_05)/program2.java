/*
 2.Write a program to print Remarks according to their respective grades.
Input : O
Output : Outstanding
Input : A
Output : Excellent
 */

 class program2 {
    public static void main(String[] args) {
        char grade = 'A';
        
        switch (grade) {
            case 'O':
                System.out.println("Grade is :"+grade);
                break;
            case 'A':
                System.out.println("Grade is :"+grade);
                break;
            default:
                System.out.println("Invalid input.");
    }
 }
}