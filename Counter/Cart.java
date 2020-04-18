package Counter;

import java.util.*;
import Composite.Item;
import Template.Card;

public class Cart implements Counter {
    private List<Item> cart=new ArrayList<Item>();
    public void add(Item item){
        cart.add(item);
    }
    public void remove(Item item){
        cart.remove(item);
    }
    public double calculateTotal() {
        Iterator<Item>it=cart.iterator();
        double total=0;
        while (it.hasNext()){
            total+=it.next().getPrice();
        }
        return total;
    }
    public String print() {
        Iterator<Item> it = cart.iterator();
        StringBuilder total= new StringBuilder();
        while (it.hasNext()){
           Item i=it.next();
           total.append(i.getName()).append(":").append(i.getPrice()).append("\n");
        }
        return total.toString();
    }
    public int number() {
        return cart.size();
    }

    public double useDiscount(Card card){
        return  card.getNewTotal(this.cart);
    }
}
