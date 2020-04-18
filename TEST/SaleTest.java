package TEST;
import static org.junit.Assert.*;
import Composite.Item;
import Composite.Toy;
import Decorator.Sale;
import org.junit.Before;
import org.junit.Test;

public class SaleTest {
    private Sale test;
    private Item toy;
    @Before
    public void setUp()throws Exception{
        toy = new Toy("Skull", 10);
        test=new Sale(toy,10);
    }
    @Test
    public void testPrice(){
        assertEquals(9,test.getPrice(),0.0);
    }
    @Test
    public void testDiscount(){
        try{
            test.setDiscount(20);
        }catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(8,test.getPrice(),0.0);
    }
    @Test
    public void exTest(){
        try{
            test.setDiscount(300);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
