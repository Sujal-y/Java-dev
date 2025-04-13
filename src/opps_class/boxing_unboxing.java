package src.opps_class;

public class boxing_unboxing {
    public static void main(String[] args){
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer ob =12;//auto boxing
        int u =ob;//auto unboxing
        
    }
}
