package src.oops.lab1;
//Write a Java program to accept the number of hours worked, hourly rate and calculates the salary for an employee
//according to the following criteria: The company pays straight time for the first 40 hours worked by each employee and
//time and a half for all hours worked in excess of 40 hours.
import java.util.Scanner;
public class prog1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int hworked =0 , hrate =0;
        double salary =0.0;
        System.out.print("How long have you worked:-");
        hworked = scan.nextInt();
        System.out.print("hourly rate:- ");
        hrate = scan.nextInt();

        if (hworked>40){
            salary = 40*hrate + 1.5*hrate*(hworked-40);
        }
        else {
            salary = hrate*hworked;
        }
        System.out.println("Salary :- "+salary);

    }
}
