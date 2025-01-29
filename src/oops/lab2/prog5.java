package src.oops.lab2;
//Write a Java programs to print factorial of a given no recursively.
import java.util.Scanner;
public class prog5 {
    static int factorial(int n){ //factorial using recursion
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //input number
        System.out.println("enetr the number");
        int num = scan.nextInt();
        System.out.printf("Factorial of %d is %d",num,factorial(num)); //calling the function here
        scan.close();
    }
}