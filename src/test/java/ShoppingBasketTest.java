import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket1;
    Product product1;
    Product product2;
    Product product3;
    Customer customer1;


    @Before
    public void before(){
        customer1 = new Customer(1, "Dave", false);
        shoppingBasket1 = new ShoppingBasket(customer1);
        product1 = new Product("Twix", 0.50, false, 1);
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

    @Test
    public void canCalculateSimpleTotal(){
        shoppingBasket1.addProduct(product1);
        assertEquals(0.50, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product2);
        assertEquals(10.50, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product3);
        assertEquals(13.30, shoppingBasket1.basketTotalValue(), 0.01);
    }

    @Test
    public void canCalculateMultipleTotal(){
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product1);
        shoppingBasket1.addProduct(product1);
        assertEquals(1.50, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product2);
        assertEquals(11.50, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product3);
        assertEquals(14.30, shoppingBasket1.basketTotalValue(), 0.01);
    }


    @Test
    public void canCalculateBogoffTotal(){
        shoppingBasket1.addProduct(product1);
        assertEquals(0.50, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product2);
        assertEquals(10.50, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product3);
        assertEquals(13.30, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product3);
        assertEquals(13.30, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product3);
        assertEquals(16.10, shoppingBasket1.basketTotalValue(), 0.01);
        shoppingBasket1.addProduct(product3);
        assertEquals(16.10, shoppingBasket1.basketTotalValue(), 0.01);
    }


}
