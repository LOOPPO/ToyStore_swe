package Counter;
import Composite.Item;

public interface Counter {
    public void add(Item item);
    public void remove(Item item);
    public double calculateTotal();
    public String print();
    public int number();
}
