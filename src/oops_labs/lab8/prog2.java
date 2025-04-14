package src.oops_labs.lab8;
//Design an interface called Series with the following methods
//i) getNext (returns the next number in series)
//ii) reset(to restart the series)
//iii) setStart (to set the value from which the series should start)
//Design a class named ByTwos that implements Series such that it generates a series
//of numbers, each two greater than the previous one. Also design a class which will
//include the main method for referencing the interface.

// Series.java
interface Series {
    int getNext();       // returns next number in series
    void reset();        // resets the series
    void setStart(int x); // sets starting value
}

// ByTwos.java
class ByTwos implements Series {
    int start;
    int current;

    public void setStart(int x) {
        start = x;
        current = x;
    }

    public int getNext() {
        current += 2;
        return current;
    }

    public void reset() {
        current = start;
    }
}

public class prog2 {
    public static void main(String[] args) {
        Series series = new ByTwos();  // Interface reference

        series.setStart(0);
        System.out.println("ByTwos Series:");
        for (int i = 0; i < 5; i++) {
            System.out.println(series.getNext());
        }

        System.out.println("Resetting...");
        series.reset();
        System.out.println("Next after reset: " + series.getNext());
    }
}
