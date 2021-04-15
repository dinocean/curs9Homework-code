package ro.fasttrackit.homework.exercitiu2;

public class Electronics extends Product {
    private String type;
    private int length;
    private int width;
    private int height;
    private int weight;

    public Electronics(int price, String name, String description, int quantity, String colour, int weight, int length, int width, int height, String type){
        super(750, "masina de spalat haine", "masina de spalat haine automata si stoarcere", 1);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType(){
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}
