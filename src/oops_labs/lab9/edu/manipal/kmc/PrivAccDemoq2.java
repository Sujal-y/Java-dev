package src.oops_labs.lab9.edu.manipal.kmc;

public class PrivAccDemoq2 {
    public static void main(String[] args) {
        src.oops_labs.lab9.edu.manipal.mit.Student s = new src.oops_labs.lab9.edu.manipal.mit.Student();
        // Set values using public setter methods
        s.setName("Alice");
        s.setRollNumber(202);
        s.displayDetails();

        // Direct access is not allowed (will cause compilation error)
        // System.out.println(s.name);          // Error
        // System.out.println(s.rollNumber);    // Error
    }
}
