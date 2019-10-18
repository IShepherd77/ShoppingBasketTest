import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;

    @Before
     public void before(){
        customer1 = new Customer(1, "Dave", true);

    }

    @Test
    public void hasId(){
        assertEquals(1, customer1.getId());
    }

    @Test
    public void hasName(){
        assertEquals("Dave", customer1.getName());
    }

    @Test
    public void hasLoyaltyCard(){
        assertEquals(true, customer1.getLoyaltyCard());
    }

 
}
