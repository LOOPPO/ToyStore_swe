package Decorator;
import Composite.Item;

public abstract class AbstractDecorator implements Item{
    private Item anitem;
    public AbstractDecorator(Item anitem){
        this.anitem=anitem;
    }
    public String getName() {
        return anitem.getName();
    }
    public double getPrice(){
        return anitem.getPrice();
    }
    public void add(Item item) throws Exception{
        anitem.add(item);
    }
    public void remove(Item item)throws Exception{
        anitem.remove(item);
    }
}
