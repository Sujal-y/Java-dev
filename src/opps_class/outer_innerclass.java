package src.opps_class;
class outclass{
    int out_variable =1;
    void out(){
        System.out.println("this from  outer class");
    }
    class innerclass{
        int in_variable =1;

        void out(){
            System.out.println("this from  inner class");
            in_variable =2;
        }
        static void static_out(){
            System.out.println("this is static inner class");
        }


    }
}


//static inner class = nested class
public class outer_innerclass {
    public static void main(String[] args){
        outclass obj = new outclass();//created outer class object

        System.out.println(obj.out_variable);
        obj.out();

        outclass.innerclass obj2 = new outclass().new innerclass(); // created inner class object via outer class

        System.out.println(obj2.in_variable);
        obj2.out();

        outclass.innerclass.static_out();

    }
}






