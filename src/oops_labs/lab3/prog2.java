package src.oops_labs.lab3;

import java.util.Scanner;

//Define a class EMPLOYEE having the following members: Ename, Eid, Basic, DA,
//Gross_Sal, Net_Sal and following methods:
//a. read(): to read N employee details
//b. display(): to display employee details
//c. compute_net_sal(): to compute net salary
//Write a Java program to read data of N employee and compute and display net salary
//of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT(income tax) = 30% of
//the gross salary)
class EMPLOYEE {
    Scanner scan = new Scanner(System.in);
    int number_of_emp=0;
    String[] ename;
    int[] eid ;
    double[] basic, DA,Gross_sal,Net_sal ;

    void read(){//it reads the input
        System.out.print("how many employees:- ");
        number_of_emp = scan.nextInt();

        ename = new String[number_of_emp] ;
        eid = new int[number_of_emp];
        basic = new double[number_of_emp];
        DA = new double[number_of_emp] ;
        Gross_sal = new double[number_of_emp];
        Net_sal = new double[number_of_emp];
        

        System.out.println("Enter the details");

        for (int i = 0; i < number_of_emp; i++) {
            scan.nextLine(); //clearing buffer
            System.out.println("EMP NO:- "+ (i+1));
            System.out.println("Name:- ");
            ename[i] = scan.nextLine();
            System.out.print("ID:- ");
            eid[i] = scan.nextInt();
            System.out.print("Basic Salary:- ");
            basic[i] = scan.nextDouble();
        }
        scan.close();
    }

    void display(){
        for (int i = 0; i < number_of_emp; i++) {
            System.out.println("EMP NO:- "+ (i+1));
            System.out.println("Name:- "+ename[i]);
            System.out.println("ID:- "+eid[i]);
            System.out.println("Basic Salary:- "+basic[i]);
        }
    }
    //DA = 52% of Basic, gross_Sal = Basic + DA; NET = 30% of
    //the gross salary
    void compute_net_sal(){
        for (int i = 0; i < number_of_emp; i++) {
            DA[i] = 0.52*basic[i];
            Gross_sal[i] =basic[i]+DA[i];
            Net_sal[i] =0.7*Gross_sal[i];
        }
        for (int i = 0; i < number_of_emp; i++) {
            System.out.println("--------------------------");
            System.out.println("name-" + ename[i]);
            System.out.println("net salary:- "+ Net_sal[i]);
        }
    }

}
public class prog2 {
    public static void main(String[] args){
        EMPLOYEE obj1 = new EMPLOYEE();
        obj1.read();
        obj1.display();
        obj1.compute_net_sal();
    }
}
