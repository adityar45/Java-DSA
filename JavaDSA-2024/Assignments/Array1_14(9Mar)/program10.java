import java.util.*;

class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); 

        double[] grades = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        System.out.println("Code to initialize the grades array:");

        for (int i = 0; i < numStudents; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(grades[i]);
        }

        sc.close();
    }
}
