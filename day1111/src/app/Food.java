package app;

public class Food {
    
    private int id;
    private String name;
    private int price;
    private int sales;
    
    public Food() {
    }
    
    public Food(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
    public Food(int id, String name, int price, int sales) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sales = sales;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getSales() {
        return sales;
    }
    public void setSales(int sales) {
        this.sales = sales;
    }
    
    @Override
    public String toString() {
        return "Food [id=" + id + ", name=" + name + ", price=" + price + ", sales=" + sales + "]";
    }
 
}
