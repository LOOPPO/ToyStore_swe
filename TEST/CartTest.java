package TEST;
import static org.junit.Assert.*;
import Composite.Item;
import Composite.Toy;
import Counter.Cart;
import Template.MemberCard;
import Template.RateCard;
import org.junit.Before;
import org.junit.Test;

public class CartTest {
    private Cart cart;
    private Item toy;
    @Before
    public void setUp(){
        cart=new Cart();
        toy=new Toy("Ball",10);
    }
    @Test
    public void testAddRemove(){
        assertEquals(0,cart.number(),0.0);
        cart.add(toy);
        assertEquals(1,cart.number(),0.0);
        cart.remove(toy);
        assertEquals(0,cart.number(),0.0);
    }
    @Test
    public void testTotal(){
        cart.add(toy);
        assertEquals(toy.getPrice(),cart.calculateTotal(),0.0);
    }
    @Test
    public void testCardTotal() throws Exception {
        cart.add(toy);
        RateCard rcard=new RateCard("Mario","Rossi",10);
        assertEquals(9,cart.useDiscount(rcard),0.0);
        MemberCard mcard=new MemberCard("Mario","Rossi",100);
        assertEquals(9,cart.useDiscount(mcard),0.0);
    }
}
