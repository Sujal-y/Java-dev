package src.oops_labs.lab8;


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
