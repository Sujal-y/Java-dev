package src.oops_labs.lab9.edu.manipal.mit;

public class Student {
    String name;          // default access
    int rollNumber;       // default access

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Public method to display student details
    public void displayDetails() {   // default access method
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
