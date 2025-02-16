package src.oops_labs.lab2;
import java.util.Scanner;
//For a given date of birth of a person, calculate the date of retirement by taking
//years of service as input. (assume service periods as 60 years).
public class prog3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the date of birth as DD-MM-YYYY(use -)");
        String date_birth = scan.nextLine();
        String yea_str = "";
        String retire_str="";
        for (int i=6 ;i<date_birth.length();i++){
            yea_str += date_birth.charAt(i);
        }
        int year =Integer.parseInt(yea_str);
        int retire_year=year+60;
        String retire_day_month="";
        for (int i=0 ;i<6;i++){
            retire_day_month += date_birth.charAt(i);

        }
        System.out.println("date of retirement:- "+retire_day_month+retire_year);
        scan.close();
    }
}
