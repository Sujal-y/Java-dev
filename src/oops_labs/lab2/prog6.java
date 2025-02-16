package src.oops_labs.lab2;
//Write a Java program to compute the electricity bill for an industry using a switch-case statement.
// The program should take the daily consumption in units for 7 days as input. Based on the total consumption,
// the program should calculate and display the total electricity bill according to the following pricing table:
//Units Price per Unit (INR)
//0 - 100 7.00
//101 - 200 8.00
//>= 201 10.00
import java.util.Scanner;
public class prog6 {
    static double electricity_bill(int[] week_usage){
        int total_usage = total_consumption(week_usage);
        double cost;


        switch (total_usage/100){
            case (0): cost = total_usage*7;      //under 100
                        break;
            case (1): cost = 100*7+(total_usage-100)*8; //under 200
                        break;
            default:
                    cost = (100 * 7) + (100 * 8) + ((total_usage - 200) * 10); //above 200
                    break;
        }
        return cost;
    }
    static int total_consumption(int[] arr){ //calculates total usage
        int sum =0;
        for (int j : arr) { //traverses through the array
            sum += j;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 7 days electricity consumption");
        int[] arr = new int[7];//7 days input
        for (int i = 0; i < 7; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Total consumption:- "+ total_consumption(arr));
        System.out.println("Total cost:- "+ electricity_bill(arr));
        scan.close();
    }
}
