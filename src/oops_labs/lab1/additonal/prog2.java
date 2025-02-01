package src.oops_labs.lab1.additonal;
//Write a Java program to find whether a given year is leap or not using boolean data type. [Hint: leap year has 366 days;]
//Algorithm:
//if (year is not exactly divisible by 4) then (it is a common year)
//else
//if (year is not exactly divisible by 100) then (it is a leap year)
//else
//if (year is not exactly divisible by 400) then (it is a common year)
//else (it is a leap year)
import java.util.Scanner;
public class prog2 {
    static Boolean leap_year(int year){
        Boolean is_leap_year = true;
        float year_float = (float)year;
        if((year_float/4)!=(float)(year/4) ){
            is_leap_year = false;
        }
        else if(year%400 == 0 && year%100 == 0) {
            is_leap_year = true;

        }
        return is_leap_year;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("enter the year");
        int year = scan.nextInt();
        System.out.println("leap year:- "+leap_year(year));
    }
}
