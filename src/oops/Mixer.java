package src.oops;

import java.util.Scanner;
import java.util.Arrays;

public class Mixer {
    private int[] arr;

    // Constructor to initialize the array
    public Mixer(int size) {
        arr = new int[size];
    }

    // Method to accept the elements of the array in ascending order without any duplicates
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " sorted elements without duplicates:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to merge the current object array elements with the parameterized array elements
    public Mixer mix(Mixer A) {
        int[] mergedArray = new int[this.arr.length + A.arr.length];
        int i = 0, j = 0, k = 0;

        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                mergedArray[k++] = this.arr[i++];
            } else {
                mergedArray[k++] = A.arr[j++];
            }
        }

        while (i < this.arr.length) {
            mergedArray[k++] = this.arr[i++];
        }

        while (j < A.arr.length) {
            mergedArray[k++] = A.arr[j++];
        }

        // Removing duplicates from the merged array
        mergedArray = Arrays.stream(mergedArray).distinct().toArray();

        // Creating the result Mixer object
        Mixer result = new Mixer(mergedArray.length);
        result.arr = mergedArray;
        return result;
    }

    // Method to display the elements of the array
    public void display() {
        System.out.println("Array elements: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Create two Mixer objects
        Mixer mixer1 = new Mixer(3);
        Mixer mixer2 = new Mixer(4);

        // Accept elements
        mixer1.accept();
        mixer2.accept();

        // Merge the arrays and get the resultant Mixer object
        Mixer mergedMixer = mixer1.mix(mixer2);

        // Display the arrays
        System.out.println("First Mixer:");
        mixer1.display();
        System.out.println("Second Mixer:");
        mixer2.display();
        System.out.println("Merged Mixer:");
        mergedMixer.display();
    }
}
