package src.oops_labs.lab3;
//Create a Die class with one integer instance variable called sideUp.
// Give it a getSideUp() method that returns the values of sideUp
// and a void roll() method that changes sideUp to a random value from 1 to 6.
// Then create a DieDemo class with a method that creates two Die objects, rolls them,
// and prints the sum of the two sides up.
import java.util.Random;

class Die{
    Random random = new Random();
    int sideup=0;

    int getSideup(){
        return sideup;
    }
    void roll(){
        sideup = random.nextInt(1,7);
    }

}
class Diedemo{
    public void sum_of_2_die(){
        Die obj1 = new Die();
        Die obj2 = new Die();
        obj1.roll();
        obj2.roll();
        System.out.println("die1:- "+obj1.getSideup());
        System.out.println("die2:- "+obj2.getSideup());
        System.out.println("sum:- "+(obj1.getSideup()+obj2.getSideup()));
    }

}
public class prog4 {
    public static void main(String[] args){
        Diedemo obj = new Diedemo();
        obj.sum_of_2_die();

    }
}
