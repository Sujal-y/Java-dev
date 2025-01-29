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

    //takes the input
    public void accept(){
        System.out.println("how many elements:- ");
        int n = scan.nextInt();
        arr = new int[n];
        System.out.println("enter the elements in ascending order without any duplicates:- ");
        for (int i = 0; i <n; i++) {
            arr[i] = scan.nextInt();
        }
    }

    //displays the array
    public void display(){
        System.out.println("The array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();

    }

    //shifts the element at n to last
    void shift(int[] array,int n){
        int temp;
        for (int i = n; i <array.length-1 ; i++) {
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }

    }

    //Mixer is an object, we are taking and returning an object
    //merges 2 arrays and sorts them
    public Mixer mix(Mixer array2){
        //created result object which we will return
        Mixer result = new Mixer();
        //setting the arrays
        int [] arr1 = arr;
        int [] arr2 = array2.arr;
        int [] arr3 = new int[arr1.length+ arr2.length];

        int k =0;

        //add all elements into resultant array
        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[k] = arr2[i];
            k++;
        }

        //sort
        int temp;
//       arr3 = Arrays.stream(result.arr).sorted().toArray(); //easy way to sort
        //bubble sort
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i; j < arr3.length; j++) {
                if(arr3[i]>arr3[j]){
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }


        //remove duplicates
        int max = arr3.length;
        for (int i = 0; i < arr3.length-1; i++) {
                if(arr3[i] == arr3[i+1]){
                    //shift everything on right to left by one
                    shift(arr3, i+1);
                    max--;
                }

            }

        //copying arr3 to result arr
        result.arr = new int[max];
        for (int i = 0; i < max; i++) {
            result.arr[i] = arr3[i];
        }

        return result;
    }
}

public class prog3 {
    public static void main(String[] args){
        Mixer arr1 = new Mixer();
        Mixer arr2 = new Mixer();

        arr1.accept();
        arr2.accept();

        Mixer merged = arr1.mix(arr2);

        arr1.display();
        arr2.display();
        merged.display();

    }
}
