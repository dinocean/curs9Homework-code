package ro.fasttrackit.homework.exercitiu2;

public class Fridge extends Electronics{
    private int temperature;

    public Fridge(int price, String name, String description, int quantity, String colour, int weight, int length, int width, int height, String type, int temperature) {
        super(1780, "Frigider", "electrocasninc de bucatarie(frigider) cu dozator si cuburi de gheata", 1, "gri", 350, 250, 300, 1000, "electrocasnic");
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
