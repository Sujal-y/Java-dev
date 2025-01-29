package src.oops.lab2;

import java.util.Scanner;
//For given a 9-digit registration number of a CSE student, identify the year of
//joining. Assuming the first two digits specify the year of joining.

public class prog2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String regno;
            System.out.println("enter registeration number");
            regno = scan.nextLine();
            System.out.println("year of joining :- 20"+regno.charAt(0)+regno.charAt(1));
        }
}
