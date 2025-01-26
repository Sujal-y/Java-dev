package src.oops.lab1;
//Write a Java program to manage stock information for multiple products. The program
//should store the product name, product price, and quantity in separate one-
//dimensional arrays for n items. The user should be able to specify which products they
//want to purchase and the desired quantity for each. Based on the user’s input, the
//program should generate and display the total bill.
import java.util.Scanner;
public class prog5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //input for store
        System.out.print("how many items:- ");
        int n = scan.nextInt();
        String[] name = new String[n];
        int[] price = new int[n];

        scan.nextLine(); //clearing buffer
        for (int i = 0; i < n; i++) {
            System.out.print("name:- ");
            name[i] = scan.nextLine();
            System.out.print("price:-");
            price[i] = scan.nextInt();
            scan.nextLine();//clearing buffer
        }


        //user end
        int total =0;
        int input = 0,quantity =0;
        while (true){
            System.out.println("which item you want to purchase (0 to exit)");
            for (int i = 0; i < name.length; i++) {
                System.out.println(i+1+"." + name[i]);
            }
            input = scan.nextInt();
            if(input == 0)break;
            System.out.print("how many:- ");
            quantity = scan.nextInt();
            total = total+ price[input-1]*quantity;

        }
        System.out.println("total bill:- "+ total);
        scan.close();
    }
}