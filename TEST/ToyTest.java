package TEST;
import Composite.Item;
import Composite.Toy;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToyTest {
    private Item testToy;
    @Before
    public void setUp() {
        testToy = new Toy("Lego", 30);
    }
    @Test
    public void testGetName() {
        assertEquals("Lego", testToy.getName());
    }
    @Test
    public void testPrice() {
        assertEquals(30, testToy.getPrice(), 0.0);
    }
    @Test
    public void testAdd() {
        try {
            testToy.add(new Toy("Subbuteo", 50));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testRemove(){
        try{
            testToy.remove(new Toy("Subbuteo",50));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
