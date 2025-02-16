package src.oops_labs.lab1;

import java.util.Scanner;
//Write a java program to add two numbers using the bitwise operator and check if the
//output is an even or odd number. [Hint: use left shift and right shift bitwise operators].

public class prog2 {
        public static int add(int a, int b) {
            while (b != 0) {
                int carry = a & b;
                a = a ^ b;
                b = carry << 1;
            }
            return a;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter 2 numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int result = add(num1, num2);
            System.out.println(num1 + " + "+num2+ " = "+result);

            if ((result & 1) == 0) {
                System.out.println("even number");
            }
            else {
                System.out.println("odd number");
            }
            scan.close();
        }
}
