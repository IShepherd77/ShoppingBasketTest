
import java.util.HashMap;

public class ShoppingBasket {


    private HashMap<Product, Integer> items;
    private Customer customer;

    public ShoppingBasket(Customer customer){

        this.items = new HashMap<Product, Integer>();
        this.customer = customer;
    }

    public void addProduct(Product item){
        if(items.containsKey(item)){
            items.put(item, 1+ items.get(item));

        } else {
            items.put(item, 1);
        }
    }

    public int itemCount(Product item){
        if(items.get(item) == null){
            return 0;
        }
        return items.get(item);
    }

    public void removeProduct(Product item){
        if(itemCount(item) >1){
            items.put(item, items.get(item) -1);

        } else {
            items.remove(item);
        }
    }

    public void emptyBasket(){
        items = new HashMap<Product, Integer>();
    }

    public double basketTotalValue(){
        double total = 0.0;
        for(HashMap.Entry<Product, Integer> item : items.entrySet()){
            Product product = item.getKey();
            int count = item.getValue();
            if (product.isBogoff()) {
                total += ((count+1) / 2) * product.getPrice();
            }  else {
                total += count * product.getPrice();
            }

        }
        if(total > 20.0){
//                total *= 0.9;
            total -= (total * 0.1);
        }
        if (customer.getLoyaltyCard()) {
            total -= (total * 0.02);
        }
        return total;
    }


}
