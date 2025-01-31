package src.oops_labs.lab3;
//Define a Class STUDENT having following
//Members: sname, marks_array, total, avg and provide the following methods:
//a. assign(): to assign initial values to the STUDENT object
//b. display(): to display the STUDENT object
//c. compute(): to Compute Total, Average marks
//Write a Java program Illustrating Class Declarations, Definition, and Accessing Class
//Members to test the class defined.
import java.util.Scanner;
class Student {
    String sname;
    int[] marks_array;
    int total = 0 , avg = 0;

    void assign(String name1 ,int[] arr){
        sname = name1;
        marks_array = arr;
    }
    void display(){
        System.out.println("name: - "+sname );
        for (int i = 0; i < marks_array.length; i++) {
            System.out.print(i+" ");
        }

    }
    void compute(){
        for (int i = 0; i < marks_array.length; i++) {
            total = total+marks_array[i];
        }
        avg = total/ marks_array.length;
        System.out.println();
        System.out.println("Total:- "+ total);
        System.out.print("AVG:- "+avg);
    }

}
public class prog1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name:- ");
        String name = scan.nextLine();
        System.out.println("how many subjects:- ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the marks");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Student obj1 = new Student();
        obj1.assign(name,arr);
        obj1.display();
        obj1.compute();

    }


}
