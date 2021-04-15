package ro.fasttrackit.homework.exercitiu2;

public class Cosmetics extends Product {
    private String colour;
    private int weight;

    public Cosmetics(int price, String description, int quantity, String colour, int weight) {
        super(25, "rimel", "pentru gene mai lungi si frumoase", 25);
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
