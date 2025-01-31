package src.opps_class;
import java.util.Scanner;
//Exercise...
//Q3. Define a class to represent a complex number called Complex. Provide the
//ii. To display a complex number in atib format.
//i. To assign initial values to the Complex object (using constructor). following member functions:
//Write a main function to test the class. v and a
class Complex{
    int real_part, complex_part;

    public Complex(int a , int b){
        real_part =a;
        complex_part =b;
    }
    public void display(){
        System.out.println();
        System.out.printf("Complex number = %d + i%d",real_part,complex_part);
    }
}
public class complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex obj = new Complex(5,6);
        obj.display();

        }

}
