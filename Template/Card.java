package Template;
import Composite.Item;

import java.util.*;

public abstract class Card {
    private String name;
    private String surname;
    public Card(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public final double getNewTotal(List<Item> cart){
        Iterator<Item>it=cart.iterator();
        double total=0;
        while (it.hasNext()){
            total+=it.next().getPrice();
        }
        return calculateNewTotal(total);
    }
    public abstract double calculateNewTotal(double total);
}
