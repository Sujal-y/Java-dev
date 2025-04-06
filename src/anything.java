package src;
import java.util.Scanner;
class hello{
    int x =1;

    {
        System.out.println("dsadsada");
    }

    void set(int x){
      this.x=x;
    }
}
public class anything {
    public static void main(String[] args) {
        hello obj = new hello();
        System.out.println(obj.x);
        obj.set(4);
        System.out.println(obj.x);

    }

}
