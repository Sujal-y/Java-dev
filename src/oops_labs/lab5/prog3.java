package src.oops_labs.lab5;
// Implement a ShoppingCart class that contains an inner class Item.
//a) The Item class should have fields like itemName, quantity, and price.
//b)The ShoppingCart class should provide methods to add items, calculate the total price,
//and display the cart contents.
class ShoppingCart{
    Item[] cart = new Item[15];
    int items_present =0;

    ShoppingCart(){
        for(int i =0;i< cart.length;i++){
            cart[i] = new Item();
        }
    }

    class Item{
        String name;
        int quantity;
        float price;
    }

    void additem(String name,int quantity,float price){
        cart[items_present].name = name;
        cart[items_present].quantity = quantity;
        cart[items_present].price = price;
        items_present++;
    }

    float compute() {
        float sum = 0;
        for(int i=0;i<=items_present;i++){
            sum += cart[i].price;
        }
        return sum;
    }

}
public class prog3 {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.additem("Lays",20,10);
        cart.additem("Coke",5,100);
        cart.additem("Candy",20,20);

        System.out.println("total:- "+cart.compute());
    }
}
