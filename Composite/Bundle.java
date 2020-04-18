package Composite;

import java.util.*;

public class Bundle implements Item {
    private List<Item> pack=new ArrayList<Item>();
    public Bundle(Item item) throws Exception{
        add(item);
    }
    public String getName(){
        Iterator<Item>it=pack.iterator();
        String name="";
        while(it.hasNext()){
            name=name.concat(it.next().getName());
            if(it.hasNext()){
                name=name.concat("+");
            }
        }
        return name;
    }
    public double getPrice(){
        Iterator<Item>it=pack.iterator();
        double price=0;
        while(it.hasNext()){
            price+=it.next().getPrice();
        }
        return price;
    }
    public void add(Item item)throws Exception{
        pack.add(item);
    }
    public void remove(Item item)throws Exception{
        pack.remove(item);
    }
}
