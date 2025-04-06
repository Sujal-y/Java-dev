package src.oops_labs.lab7;
//To the already defined STUDENT class, add two subclasses ScienceStudent and
//ArtsStudent and implement the following:
//i) Add a data member practicalMarks (int) to the ScienceStudent class that
//represents the marks obtained by the student in the laboratory subject. The
//ScienceStudent class should override the compute() method to include the
//practical marks in the total marks and average marks calculation. Additionally,
//the ScienceStudent class should provide a method displayPracticalMarks() to
//display the practical marks obtained by the science student.
//ii) Add a data member electiveSubject (String): to the ArtsStudent class that
//represents the elective subject chosen by the arts student. Also, add appropriate
//constructors to the subclasses.
//In main(), create objects of STUDENT, ScienceStudent, and ArtsStudent, and
//demonstrate the keyword ‘super’ and other functionalities of the classes by assigning
//values, computing marks, and displaying the information of the students. Also,
//demonstrate dynamic polymorphism.

class student{
    String name;
    int age;
    int[] marks;
    int total=0,average;

    student(String name,int age,int[] marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void compute(){
        for (int i:marks){
            total+=i;
        }
        average = total/ marks.length;
    }

    void display(){
        System.out.println("marks: - ");
        for (int i:marks){
            System.out.println(i);
        }
        System.out.println("total = "+total);
        System.out.println("average ="+average);
    }
}

class Science_student extends student{

    Science_student(String name,int age,int[] marks,int practical_marks){
        super(name, age, marks);
        this.practical_mark = practical_marks;
    }
    int practical_mark;

    void compute(){
        for (int i:marks){
            total+=i;
        }
        total+=practical_mark;
        average = (total)/ (marks.length+1);
    }

    void display(){
        System.out.println("marks: - ");
        for (int i:marks){
            System.out.println(i);
        }
        System.out.println("practical marks :-"+practical_mark);
        System.out.println("total = "+total);
        System.out.println("average ="+average);
    }
}

class arts_student extends student{
    String electiveSubject;

    arts_student(String name, int age, int[] marks,String electiveSubject) {
        super(name, age, marks);
        this.electiveSubject = electiveSubject;
    }
}

public class prog1 {
    public static void main(String[] args){
        student s1 = new student("sujal",18,new int[]{2,3,4});

        System.out.println("science student");
        Science_student ss1 = new Science_student("sathivk",21, new int[]{10,30,20},40);
        ss1.compute();
        ss1.display();

        System.out.println("arts student");
        arts_student as1 =new arts_student("yashdeep",29, new int[]{4,5,6},"how to be a loser");
        as1.compute();
        as1.display();

    }
}
