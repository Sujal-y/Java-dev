package src.com.learning.WEIGHT_CONVERTER;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Enter 1 or 2");
        System.out.println("1.lbs to kg");
        System.out.println("2.kg to lbs");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double input=0.0;
        switch (choice){
            case 1 :
                System.out.println("Enter lbs:-");
                input = sc.nextDouble();
                System.out.println("in KGs:- "+weightconvertor.lbstokg(input));
                break;
            case 2 :
                System.out.println("Enter Kg:-");
                input = sc.nextDouble();
                System.out.println("in LBS:- "+weightconvertor.kgtolbs(input));
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
                break;
        }

    }
}
