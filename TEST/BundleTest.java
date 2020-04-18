package TEST;
import static org.junit.Assert.*;
import Composite.Item;
import Composite.Toy;
import Composite.Bundle;
import org.junit.Before;
import org.junit.Test;

public class BundleTest {
    private Item testPack;
    private Item testToy;
    @Before
    public void setUp() throws Exception {
        testPack=new Bundle(new Toy("Speed",20));
        testToy=new Bundle(new Toy("Car",15));
    }
    @Test
    public void testName(){
        try{
            testPack.add(testToy);
        }catch (Exception e){
            e.printStackTrace();
        }
        assertEquals("Speed+Car",testPack.getName());
        try{
            testPack.remove(testToy);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void testPrice(){
        assertEquals(20,testPack.getPrice(),0.0);
        try{
            testPack.add(testToy);
            assertEquals(35,testPack.getPrice(),0.0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
