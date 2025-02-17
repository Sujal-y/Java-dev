package src.oops_labs.lab4;
//Consider the already defined EMPLOYEE class.
// Provide a default constructor, and parameterized constructor. Also provide a display method.
// Illustrate all the constructors as well as the display method by defining EMPLOYEE objects.
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
    //default constructor
    EMPLOYEE(){
        this.name = "default";
        this.id = 0000;
        this.salary = 0.0;
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("id:- "+id);
        System.out.println("salary:- "+ salary);
    }
}

public class prog2 {
    public static void main(String[] args){
        EMPLOYEE default_constructor = new EMPLOYEE();
        EMPLOYEE  parameterized_constructor = new EMPLOYEE("Sujal", 100,120000.00);

        default_constructor.display();
        parameterized_constructor.display();
    }
}
