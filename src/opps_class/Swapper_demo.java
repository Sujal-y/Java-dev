package src.opps_class;
import java.util.Scanner;

class Swapper{
    int x,y;
    public Swapper(int a , int b){
        this.x =a;
        this.y =b;
    }
    int getX(){

        return this.x;
    }
    int getY(){

        return this.y;
    }
    void swap(){
        int temp = this.x;
        this.x= this.y;
        this.y = temp;
    }
}
public class Swapper_demo  {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Swapper obj = new Swapper(3,4);

            System.out.println(obj.getX());
            System.out.println(obj.getY());

            System.out.println("after swap");
            obj.swap();

            System.out.println(obj.getX());
            System.out.println(obj.getY());
        }
    }

