import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    ShoppingBasket shoppingBasket1;

    @Before
     public void before(){
        shoppingBasket1 = new ShoppingBasket();
        customer1 = new Customer(1, "Dave", true, shoppingBasket1);
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

    @Test
    public void hasShoppingBasket(){
        assertEquals(shoppingBasket1, customer1.getShoppingBasket());
    }
}
