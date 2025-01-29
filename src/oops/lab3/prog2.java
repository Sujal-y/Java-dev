package src.oops.lab3;

import java.util.Scanner;

//Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA,
//Gross_Sal, Net_Sal and following methods:
//a. read(): to read N employee details
//b. display(): to display employee details
//c. compute_net_sal(): to compute net salary
//Write a Java program to read data of N employee and compute and display net salary
//of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; NET = 30% of
//the gross salary)
class EMLOYEE{
    Scanner scan = new Scanner(System.in);
    String[] ename = new String[10] ;
    int[] eid = new int[10];
    double[] basic=new double[10], DA =new double[10] ,Gross_sal=new double[10],Net_sal=new double[10];
    int number_of_emp=0;

    void read(){// number of emp ,name , id ,basic salary
        System.out.print("how many employees:- ");
        number_of_emp = scan.nextInt();

        System.out.println("Enter the details");

        for (int i = 0; i < number_of_emp; i++) {
            scan.nextLine(); //clearing buffer
            System.out.println("EMP NO:- "+ i);
            System.out.println("Name:- ");
            ename[i] = scan.nextLine();
            System.out.print("ID:- ");
            eid[i] = scan.nextInt();
            System.out.print("Basic Salary:- ");
            basic[i] = scan.nextDouble();
        }
    }
    void display(){
        for (int i = 0; i < number_of_emp; i++) {
            System.out.println("EMP NO:- "+ i);
            System.out.println("Name:- "+ename[i]);
            System.out.println("ID:- "+eid[i]);
            System.out.println("Basic Salary:- "+basic[i]);
        }
    }
    //DA = 52% of Basic, gross_Sal = Basic + DA; NET = 30% of
    ////the gross salary)
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
        EMLOYEE obj1 = new EMLOYEE();
        obj1.read();
        obj1.display();
        obj1.compute_net_sal();
    }
}

