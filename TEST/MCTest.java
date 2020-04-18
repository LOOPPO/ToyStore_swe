package TEST;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Template.*;

public class MCTest {
    private MemberCard card;
    @Before
    public void setUp()throws Exception{
        card=new MemberCard("Mario","Rossi",100);
    }
    @Test
    public void testNewPrice(){
        assertEquals(9,card.calculateNewTotal(10),0.0);
    }
    @Test
    public void testAdd(){
        card.add(100);
        assertEquals(200,card.getPoints(),0.0);
    }
    @Test
    public void testRemove(){
        card.remove(100);
        assertEquals(0,card.getPoints(),0.0);
    }
    @Test
    public void testGet(){
        assertEquals(100,card.getPoints(),0.0);
    }
}
