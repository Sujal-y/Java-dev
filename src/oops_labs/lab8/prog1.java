package src.oops_labs.lab8;
//Create an abstract class Figure with an abstract method area and two integer variables
//that represent x and y dimensions. Create three more classes Rectangle, Triangle and
//Square that extend Figure and implement the area method appropriately. Illustrate
//how the method area can be computed at run time for Rectangle, Square and Triangle
//to achieve dynamic polymorphism

abstract class Figure {
    int x, y;

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();
}

// Rectangle class
class Rectangle extends Figure {
    Rectangle(int x, int y) {
        super(x, y);
    }

    double area() {
        return x * y;
    }
}

// Triangle class
class Triangle extends Figure {
    Triangle(int x, int y) {
        super(x, y);
    }

    double area() {
        return 0.5 * x * y;
    }
}

// Square class
class Square extends Figure {
    Square(int side) {
        super(side, side);
    }

    double area() {
        return x * x;
    }
}

public class prog1 {
    public static void main(String[] args) {
        Figure fig;

        fig = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + fig.area());

        fig = new Triangle(10, 5);
        System.out.println("Triangle Area: " + fig.area());

        fig = new Square(4);
        System.out.println("Square Area: " + fig.area());
    }
}
