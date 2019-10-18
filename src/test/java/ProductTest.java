import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.BindingType;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product1;
    Product product2;

    @Before
    public void before(){
        product1 = new Product("Mars Bar", 0.59, true, 1);
        product2 = new Product("Milky Bar", 0.45, false, 2);
    }

    @Test
    public void hasName(){
        assertEquals("Mars Bar", product1.getName());
        assertEquals("Milky Bar", product2.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(0.59, product1.getPrice(), 0.01);
        assertEquals(0.45, product2.getPrice(), 0.01);
    }

    @Test
    public void hasBogoff(){
        assertEquals(true, product1.isBogoff());
        assertEquals(false, product2.isBogoff());
    }

    @Test
        public void hasId(){
        assertEquals(1, product1.getId());
        assertEquals(2, product2.getId());
    }





}
