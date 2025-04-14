package src.oops_labs.lab9.edu.manipal.mit;

public class DefaultAccessDemo {
    public static void main(String[] args) {
        // Since DefaultAccessDemo is in the same package,
        // it can access the Student class and its members
        Student s = new Student();
        s.name = "John";
        s.rollNumber = 101;
        s.displayDetails();
    }
}
