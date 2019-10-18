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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    public void setShoppingBasket(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

}
