import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private boolean bogoff;
    private int id;

    public Product(String name, double price, boolean bogoff, int id){
        this.name = name;
        this.price = price;
        this.bogoff = bogoff;
        this.id = id;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
}

    public void setName(String name){
        this.name = name;
}

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double Price){
        this.price = price;
    }

    public boolean isBogoff(){
        return this.bogoff;
    }

    public void setBogoff(){
        this.bogoff = bogoff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
