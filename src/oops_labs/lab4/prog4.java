package src.oops_labs.lab4;
//Create a class called Counter that contains a static data member to count the number
//of Counter objects being created. Also define a static member function called
//showCount() which displays the number of objects created at any given point of
//time. Illustrate this.
class Counter{
    static int count =0;
    static void showcount(){
        System.out.println("count = "+Counter.count);
    }
    Counter(){
        Counter.count++;
    }
}
public class prog4 {
    public static void main(String[]args) {
        Counter obj1 = new Counter();
        Counter.showcount();

    }
}
