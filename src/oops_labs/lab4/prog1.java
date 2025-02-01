package src.oops_labs.lab4;
//Consider the already defined STUDENT class.
// Provide a default constructor and parameterized constructor to this class.
// Also provide a display method.
// Illustrate all the constructors as well as the display method
// by defining STUDENT objects
class STUDENT{
    String name;
    int rollno;

    //parameterized constructor
    STUDENT(String name,int rollno){
        this.name =name;
        this.rollno = rollno;
    }
    // default
    STUDENT(){
        name = "default";
        rollno = 00000;
    }

    //displays the data
    void display(){
        System.out.printf("name:- %s\n",name);
        System.out.printf("roll no :- %d\n",rollno);
    }

}
public class prog1 {
    public static void main(String[] args){
        STUDENT obj1 = new STUDENT();//default constructor
        STUDENT obj2 = new STUDENT("sujal",24580);//parameterised

        obj1.display();
        System.out.println("parameteriazed:- ");
        obj2.display();

    }
}
