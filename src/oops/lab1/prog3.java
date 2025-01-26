package src.oops.lab1;
//Write a Java program to execute the following statements. Observe and analyze the outputs.
//        a. int x =10; b. double x = 10.5; c. double x=10.5;
//double y = x; int y = x; int y = (int) x
//System.out.println(y); System.out.println(y); System.out.println(y);
public class prog3 {
    public static void main(String[] args){
        //A
//        int x =10;
//        double y = x;
//        System.out.println(y);
        //B
//        double x =10.5;
//        int y = x;
//        System.out.println(y);
        //C
        double x =10.5;
        int y = (int)x;
        System.out.println(y);

    }
}
//output
//a. 10.0
//b. Error java: incompatible types: possible lossy conversion from double to int
//c. 10