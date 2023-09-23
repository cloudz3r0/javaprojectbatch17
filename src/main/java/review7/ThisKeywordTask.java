package review7;

public class ThisKeywordTask {/*
    Create a class ShoppingStore and Main class.
    - item,
- price,
- quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic  to calculate the total price of items in stock. and print the result.
There is two of each item
return the total value.
Blanket 49.99
Mattress 219.59
*/
}
class ShoppingStore{
        String item;
        double price;
        int quantity;
        public ShoppingStore(String item,double price,int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;
        }
        public double itemTotalPrice(){
            double totalValue=price *  quantity;
            System.out.println(item+" Total value of all items"+totalValue);
            return totalValue;
        }
    }

class Main {
    public static void main(String[] args) {
        ShoppingStore blanket=new ShoppingStore("Blanket",49.99,2);
        double blanketTotal=blanket.itemTotalPrice();

        ShoppingStore mattress=new ShoppingStore("Mattress",219.59,2);
        double mattressTotal=mattress.itemTotalPrice();
        double totalValue=blanketTotal+mattressTotal;
        System.out.println("You purchased "+ totalValue+ " Today");
    }
}