package src.opps_class;
//1. Create a class Student with data members: regNum, name, subjectWiseMarks, totalMarks, Exercise
//members with default values. b) A parameterized constructor to initialize the regNum, name, Grade.
// Include the following constructors: a) A default constructor to initialize the data
//and subject WiseMarks a cading system).
class student{
    int regNum,totalMarks;
    String name;
    int[] subject_wise_marks = new int[6],Grade =new int[6];

    //constructor
    student(int regNum,String name,int[] marks){
        this.regNum = regNum;
        this.name = name;
        this.subject_wise_marks = marks;
    }

    student(){
        this.regNum = 245805200;
        this.name = "sujal";
        this.subject_wise_marks = new int[] {29, 32, 46,98,76,60};

    }

    void compute(){
        //total marks
        int sum = 0;
        for(int i:this.subject_wise_marks){
            sum += i;
        }
        this.totalMarks = sum;

        //grades
        for (int i = 0; i < this.subject_wise_marks.length; i++) {
            this.Grade[i] = grade(this.subject_wise_marks[i]);
        }
    }

    void display(){
        System.out.println("name:- "+this.name);
        System.out.println("regNum:- "+this.regNum);
        for (int i = 0; i < this.subject_wise_marks.length; i++) {

            System.out.printf("sub %d : marks:- %d :grade:- %c",i+1,this.subject_wise_marks[i],this.Grade[i]);
            System.out.println();
        }
    }

    char grade(int a){
        char letter_grade =' ';
        switch (a/10){
            case 9:letter_grade='A';
            break;
            case 8:letter_grade='B';
            break;
            case 7: letter_grade ='C';
            break;
            case 6: letter_grade ='D';
            break;
            case 5: letter_grade='E';
            break;
            default:
                letter_grade = 'F';
        }
        return letter_grade;
    }
}

public class student_file {
    public static void main(String[] args) {
        student obj1 = new student();
        student obj2 = new student(245805201, "sujal_not", new int[]{50, 67, 89});

        System.out.println("obj2 :- ");
        obj2.compute();
        obj2.display();

        System.out.println("obj1:- ");
        obj1.compute();
        obj1.display();
    }
}