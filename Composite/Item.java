package Composite;

public interface Item {
    public String getName();
    public double getPrice();
    public void add(Item item) throws Exception;
    public void remove(Item item) throws Exception;
}

