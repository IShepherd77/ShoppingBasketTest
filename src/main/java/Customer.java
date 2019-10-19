public class Customer {

    private int id;
    private String name;
    private boolean loyaltyCard;
    private ShoppingBasket shoppingBasket;

    public Customer (int id, String name, boolean loyaltyCard){
        this.id = id;
        this.name = name;
        this.loyaltyCard = loyaltyCard;
        this.shoppingBasket = null;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public boolean getLoyaltyCard() {
        return loyaltyCard;
    }


    public void setShoppingBasket(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

}
