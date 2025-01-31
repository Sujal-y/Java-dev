package src.oops_labs.lab1;
//Write a Java program to rotate the elements of an array to the right/left by a given number of steps.
// The program should handle arrays of different sizes and should be able to rotate the array in both directions
// (left and right).
import java.util.Scanner;
public class prog4 {
    public static void main(String[] args){
        System.out.printf("Enter the size of array:- ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int steps =0 , direction =0;
        System.out.println("which direction 1. right 2. left:- ");
        direction = scan.nextInt();
        System.out.println("By how many steps:- ");
        steps = scan.nextInt();

        if(direction == 1) {
            int firstele =0;
            for (int i = 0; i < steps; i++) {
                firstele = arr[arr.length - 1];
                //switching elements
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = firstele;
            }
        }
        else if (direction == 2){
            int lastele=0;
            for (int i = 0; i < steps; i++) {
                lastele = arr[0];
                //switching elements
                for (int j = 0; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = lastele;
            }
        }
        else {System.out.print("Invaild direction"); System.exit(1);}

        System.out.print("after pushing the arrays:- ");
        //output array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
    }
}
