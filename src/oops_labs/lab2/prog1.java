package src.oops_labs.lab2;
import java.util.Scanner;
//A Taxi service offers a new service based on travel distance. Write a Java
//program to calculate the total distance traveled by considering the following
//charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR
//5/km.
import java.util.Scanner;
public class prog1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_dist =0;
        System.out.println("enter the fare price");
        int price = scan.nextInt();
        if(price >= (5*10+15*8)){
            total_dist = 5+15+(price-(5*10+15*8))/5;
        }
        else if (price >= (5*10)){
            total_dist = 5+(price-(5*10))/8;
        } else {
            total_dist = price/10;

        }
        System.out.printf("Total distance: - %d km",total_dist);
        scan.close();
    }
}