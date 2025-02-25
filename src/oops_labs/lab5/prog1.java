package src.oops_labs.lab5;
//1. Student Class
//Enhance the STUDENT class by adding an inner class named Subject that handles details of
//individual subjects. Where:
//a) The inner class Subject should:
//a. Contain fields for subjectName and marks.
//b. Provide methods to assign marks and display subject details.
//b) The STUDENT class should maintain an array of Subject objects.
//c) The STUDENT class should:
//a. Provide methods to add subjects.
//d) Calculate total and average marks by iterating over the Subject objects.

import java.util.Scanner;
class STUDENT{
    Scanner scan = new Scanner(System.in);
    Subject[] s;

    public STUDENT(int n) {
        this.s = new Subject[n];
    }

    class Subject{
        String subjectName;
        int marks;

        void assign(String subjectName,int marks){
            this.subjectName = subjectName;
            this.marks =marks;
        }

        void display(){
            System.out.println("sub name:- "+subjectName);
            System.out.println( "marks:- "+marks);

        }
    }

    void add_subjects(int n){
        s = new Subject[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Subject(); // Initialize each Subject object
        }
        for (int i = 0; i < n; i++) {
            System.out.print("enter subject name:- ");
            String name = scan.nextLine();
            System.out.println("enter the marks:- ");
            int mark = scan.nextInt();
            s[i].assign(name,mark);


        }
    }

    int total=0, average;
    void compute(){
        for (int i = 0; i < s.length; i++) {
            total += s[i].marks;
        }
        average = total/ s.length;
        System.out.println("total:- "+total);
        System.out.println("average:- "+ average);
    }
}

public class prog1 {

    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many subjects");
        int n = scan.nextInt();
        STUDENT obj = new STUDENT(n) ;
        obj.add_subjects(n);
        obj.compute();


    }
}
