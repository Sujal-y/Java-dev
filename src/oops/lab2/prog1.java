package src.oops.lab2;
import java.util.Scanner;
//A Taxi service offers a new service based on travel distance. Write a Java
//program to calculate the total distance traveled by considering the following
//charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR
//5/km.
public class prog1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter distance traveled:-");
        int total_distance = scan.nextInt();
        int price ;

        if (total_distance <= 5) {
            price = total_distance * 10;
        } else if (total_distance <= 20) {
            price = 5 * 10 + (total_distance - 5) * 8;
        } else {
            price = 5 * 10 + 15 * 8+ (total_distance-20)*5;

        }
        System.out.println(price);
    }
}