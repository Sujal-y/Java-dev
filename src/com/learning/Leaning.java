package src.com.learning;
public class Leaning {
    public static void main(String[] args) {
        int x =121;
        String y ="" ;
        boolean output = false;
        String a = String.valueOf(x);
        for (int i = a.length()-1;i>=0;i--){
            y = y + a.charAt(i);
        }
        if( a.equals(y)){
            output = true;
        }
        System.out.println(output);
    }
}