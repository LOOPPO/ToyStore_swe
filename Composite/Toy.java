package Composite;

public class Toy implements Item {
    private String name;
    private double price;
    public Toy(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void add(Item item)throws Exception{
        throw new Exception("Error,only one,please!");
    }
    public void remove(Item item)throws Exception{
        throw new Exception("Error,wrong operation!");
    }
}
