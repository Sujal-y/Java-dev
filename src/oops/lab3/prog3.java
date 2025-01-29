package src.oops.lab3;

import java.util.Scanner;

//Define a class Mixer to merge two sorted integer arrays in ascending order with
//the following instance variables and methods:
//instance variables:
//int arr[] //to store the elements of an array
//Methods:
//void accept() // to accept the elements of the array in ascending order without any duplicates
//Mixer mix(Mixer A) // to merge the current object array elements with the parameterized array elements and return the resultant object
//void display() // to display the elements of the array Define the main() method to test the class.
class Mixer{
    Scanner scan = new Scanner(System.in);
    int[] arr;

    public void accept(){
        System.out.println("how many elements:- ");
        int n = scan.nextInt();
        arr = new int[n];
        System.out.println("enter the elements in ascending order without any duplicates:- ");
        for (int i = 0; i <n; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public void display(){
        System.out.println("The array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }

    }

    public Mixer mix(Mixer A){
        Mixer merged_array = new Mixer();
        return A;
    }
}
public class prog3 {
    public static void main(String[] args){
        Mixer arr1 = new Mixer();
        Mixer arr2 = new Mixer();

        arr1.accept();

    }
}
