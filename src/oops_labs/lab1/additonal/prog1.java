package src.oops_labs.lab1.additonal;
//Write a Java program to find the result of the following expressions for various values of a & b:
//a. (a << 2) + (b >> 2)
//b. (b > 0)
//c. (a + b * 100) / 10
//d. a & b
import java.util.Scanner;
public class prog1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numebrs");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int a1 = (a << 2) + (b >> 2);
        Boolean b1 = (b > 0);
        int c1 = (a + b * 100) / 10;
        int d1 = a & b;

        System.out.printf("a. %d\n",a1);
        System.out.printf("b. %b\n",b1);
        System.out.printf("c. %d\n",c1);
        System.out.printf("d. %d\n",d1);

    }
}
