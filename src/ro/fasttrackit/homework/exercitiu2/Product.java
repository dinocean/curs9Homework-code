package ro.fasttrackit.homework.exercitiu2;

public class Product {
    private int price;
    private String name;
    private String description;
    private int quantity;

    public Product(int price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }


    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
