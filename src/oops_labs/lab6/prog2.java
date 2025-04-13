package src.oops_labs.lab6;
//To the already defined Employee class, add the following string processing methods:
//i. formatEmployeeName(): A method that formats the employee's name by
//capitalizing the first letter of each word and converting the remaining letters
//to lowercase. For example, if the employee's name is "JOHN DOE", this
//method would transform it to "John Doe".
//ii. generateEmail(): A method that generates an email address for the employee
//based on their name. For example, if the employee's name is "John Doe", this
//method would generate an email address like jdoe@example.com.
//Illustrate the above methods upon creating an array of Employee objects. The details
//of each Employee object must be read from the user and initialized using the
//parameterised constructor.

import java.util.Scanner;

class EMPLOYEE{
    String name;
    int id ;
    double salary;

    //parameterized constructor
    EMPLOYEE(String name, int id , double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("id:- "+id);
        System.out.println("salary:- "+ salary);
        System.out.println("formatted Employee Name:- "+formatEmployeeName(name));
        System.out.println("email:- "+generateEmail());
    }

    public static String formatEmployeeName(String name) {
        String[] words = name.toLowerCase().split(" ");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                formattedName.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return formattedName.toString().trim();
    }

    public String generateEmail() {
        String[] parts = name.toLowerCase().split(" ");
        String email = parts[0].charAt(0) + parts[parts.length - 1] + "@example.com";
        return email;
    }
}

public class prog2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many employees");
        int n = scan.nextInt();
        EMPLOYEE[] employees = new EMPLOYEE[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            scan.nextLine(); // Consume newline
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter salary: ");
            int salary = scan.nextInt();
            employees[i] = new EMPLOYEE(name, salary, 3);
        }

        for (int i = 0; i < n; i++) {
            employees[i].display();
        }
    }
}
