package src.oops.lab2;
import java.util.Scanner;
//Write a Java program to display non diagonal elements and find their sum.
//right to the bottom left corner is called non principal diagonal.]
//        [Hint: Non Principal diagonal: The diagonal of a diagonal matrix from the top
public class prog4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("size of nXn array");

        int n = scan.nextInt();
        int[][] array = new int[n][n];
        System.out.println("enter");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();
            }

        }


    }

}
