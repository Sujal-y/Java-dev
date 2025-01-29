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
        int totaldist = scan.nextInt();
        int price = 0;

        if (totaldist <= 5) {
            price = totaldist * 10;
        } else if (totaldist <= 20) {
            price = 5 * 10 + (totaldist - 5) * 8;
        } else {
            price = 5 * 10 + 15 * 8+ (totaldist-20)*5;

        }
        System.out.println(price);
    }
}