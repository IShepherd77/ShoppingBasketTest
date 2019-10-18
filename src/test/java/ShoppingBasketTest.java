import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket1;
    Product product1;
    Product product2;
    Product product3;
    Customer customer;


    @Before
    public void before(){
        customer = new Customer(1, "Dave", true);
        shoppingBasket1 = new ShoppingBasket(customer);
        product1 = new Product("Twix", 0.50, true, 1);
        product2 = new Product("Multipack Beer", 10.00, false, 2);
        product3 = new Product("Bacon", 2.80, true, 3);
    }


    @Test
    public void canAddToShoppingBasket(){
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product2);
        shoppingBasket1.addProduct(product3);
        assertEquals(2, shoppingBasket1.itemCount(product1));
        assertEquals(1, shoppingBasket1.itemCount(product2));
        assertEquals(1, shoppingBasket1.itemCount(product3));
    }

    @Test
    public void canRemoveToShoppingBasket(){
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product2);
        shoppingBasket1.addProduct(product3);
        shoppingBasket1.removeProduct(product1);
        assertEquals(1, shoppingBasket1.itemCount(product1));
        shoppingBasket1.removeProduct(product1);
        shoppingBasket1.removeProduct(product2);
        shoppingBasket1.removeProduct(product3);
        assertEquals(0, shoppingBasket1.itemCount(product1));
        assertEquals(0, shoppingBasket1.itemCount(product2));
        assertEquals(0, shoppingBasket1.itemCount(product3));
    }


    @Test
    public void canEmptyBasket(){
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product2);
        shoppingBasket1.addProduct(product3);
        shoppingBasket1.emptyBasket();
        assertEquals(0, shoppingBasket1.itemCount(product1));
        assertEquals(0, shoppingBasket1.itemCount(product2));
        assertEquals(0, shoppingBasket1.itemCount(product3));
    }

}
