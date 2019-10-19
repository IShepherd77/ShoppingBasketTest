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


    public String getName(){
        return this.name;
}



    public double getPrice(){
        return this.price;
    }



    public boolean isBogoff(){
        return this.bogoff;
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
