package src.oops_labs.temp;
import java.util.Scanner;

class STUDENT {
    Scanner scan = new Scanner(System.in);
    Subject[] s; // Array to store subjects
    int numSubjects; // Track the number of subjects

    // Inner class Subject
    static class Subject {
        String subjectName;
        int marks;

        void assign(String subjectName, int marks) {
            this.subjectName = subjectName;
            this.marks = marks;
        }

        void display() {
            System.out.println("Subject Name: " + subjectName);
            System.out.println("Marks: " + marks);
        }
    }

    // Constructor to initialize subject array
    STUDENT(int numSubjects) {
        this.numSubjects = numSubjects;
        s = new Subject[numSubjects]; // Allocate memory for subject objects
    }

    void add_subjects() {
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name: ");
            String name = scan.next();
            System.out.print("Enter the marks: ");
            int mark = scan.nextInt();

            s[i] = new Subject(); // Initialize the Subject object
            s[i].assign(name, mark);
        }
    }

    void compute() {
        int total = 0;
        for (int i = 0; i < numSubjects; i++) {
            total += s[i].marks;
        }
        double average = (double) total / numSubjects;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    void display_subjects() {
        for (int i = 0; i < numSubjects; i++) {
            s[i].display();
        }
    }
}

public class prog1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many subjects? ");
        int n = scan.nextInt();

        STUDENT obj = new STUDENT(n); // Pass subject count to constructor
        obj.add_subjects(); // Add subjects
        obj.compute(); // Compute total and average
        obj.display_subjects(); // Display subject details
    }
}
