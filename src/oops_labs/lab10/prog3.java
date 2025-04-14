package src.oops_labs.lab10;
//Write a program to calculate the average marks of a student. If the total marks are zero
//or the number of subjects is zero, throw an ArithmeticException to avoid division by
//zero. Create a Student class , add a method calculateAverage(int totalMarks, int
//numberOfSubjects) that throws ArithmeticException if numberOfSubjects is zero. Write
//a MarksValidationDemo class to invoke the calculateAverage method with valid and
//invalid data. Handle the exception and display an appropriate error message.
class student {
    public double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Number of subjects cannot be zero.");
        }
        return (double) totalMarks / numberOfSubjects;
    }
}

public class prog3 {
    public static void main(String[] args) {
        student s = new student();

        try {
            double avg = s.calculateAverage(450, 5);  // valid
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double avg = s.calculateAverage(300, 0);  // invalid
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
