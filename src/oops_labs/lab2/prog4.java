package src.oops_labs.lab2;
import java.util.Scanner;
//Write a Java program to display non-diagonal elements and find their sum.
//  [Hint: Non-Principal diagonal: The diagonal of a diagonal matrix from the top
//right to the bottom left corner is called non-principal diagonal.]
// taking all elements except the diagonals(principle and non principle)
public class prog4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //inputting size of array
        System.out.println("size of nXn array");
        int n = scan.nextInt();
        //initializing the array
        int[][] array = new int[n][n];

        System.out.println("enter the elements");
        //input for the arrays
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        //printing out non diagonal elements
        int sum =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j)!=(n-1) && i!=j){ // principle diagonal elements condition i == j and non principle i+j != n-1
                    System.out.print(array[i][j]+ " ");
                    sum+= array[i][j];
                }

            }
        }
        System.out.println();
        System.out.printf("sum = %d",sum);
    }
}