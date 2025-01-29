package src.oops.lab2;

import java.util.Scanner;
//For given a 9-digit registration number of a CSE student, identify the year of
//joining. Assuming the first two digits specify the year of joining.

public class prog2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String reg_no;
            System.out.println("enter registration number");
            reg_no = scan.nextLine();
            System.out.println("year of joining :- 20"+ reg_no.charAt(0)+ reg_no.charAt(1));
        }
}
