package src.oops_labs.lab2;

import java.util.Scanner;
//For given a 9-digit registration number of a CSE student, identify the year of
//joining. Assuming the first two digits specify the year of joining.

public class prog2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String reg_no;
            System.out.println("enter registration number");
            reg_no = scan.nextLine();
            String year_of_join ="20";
            year_of_join+=reg_no.charAt(0);
            year_of_join += reg_no.charAt(1);
            System.out.println("year of joining :- "+year_of_join);
            scan.close();
        }
}
