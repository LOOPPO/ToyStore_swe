package TEST;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Template.*;

public class RCTest {
    private RateCard rcard;
    @Before
    public void setUp() throws Exception {
        rcard=new RateCard("Mario","Rossi",10);
    }
    @Test
    public void testPrice(){
        assertEquals(9,rcard.calculateNewTotal(rcard.getRate()),0.0);
    }
    @Test
    public void testSet()throws Exception{
        try {
            rcard.setRate(20);
        }catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(20,rcard.getRate(),0.0);
    }
    @Test
    public void testExRate(){
        try{
            rcard.setRate(300);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
