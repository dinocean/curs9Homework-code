package ro.fasttrackit.homework.exercitiu2;

public class Main {
    public static void main(String[] args) {
        Product produsul = new Product(45,"Head&Shoulders","sampon pentru par cu matreaza",1);

        System.out.println("Numele produsului: " + produsul.getName());
        System.out.println("Descriere: " + produsul.getDescription());
        System.out.println("Pretul de " + produsul.getPrice() + " Lei");
        System.out.println("Cantitate continut " + produsul.getQuantity() + " ml");

        System.out.println("--------------- FIRSTCHILD ---------------");

        Cosmetics firstChild = new Cosmetics(25,"pentru gene lunigi si fumoase",1,"negru",25);

        System.out.println("Numele produsului: " + firstChild.getName());
        System.out.println("Descriere: " + firstChild.getDescription());
        System.out.println("Pretul de " + firstChild.getPrice() + " Lei");
        System.out.println("Cantitate continut " + firstChild.getQuantity() + " buc");
        System.out.println("Culoarea este: " + firstChild.getColour());
        System.out.println("Greutate: " + firstChild.getWeight() + " g");

        System.out.println("--------------- SECONDCHILD ---------------");

        Electronics secondChild = new Electronics(750, "masina de spalat haine", "masina de spalat haine automata si strorcator", 1,"white",285,300,300,500,"electrocasnic baie");

        System.out.println("Numele produsului: " + secondChild.getName());
        System.out.println("Pretul de " + secondChild.getPrice());
        System.out.println("Descriere: " + secondChild.getDescription());
        System.out.println("Cantitate produs: " + secondChild.getQuantity());
        System.out.println("Tipul de produs: " + secondChild.getType());
        System.out.println("Dimensiunii: Lungime: " + secondChild.getLength() + "cm, Latime: " + secondChild.getWidth() + "cm, Inaltime: " + secondChild.getHeight() + "cm.");
        System.out.println("Greutate: " + secondChild.getWeight() + "kg");

        System.out.println("--------------- SUBCHILD ---------------");

        Fridge product = new Fridge(1700,"Frigider","Frigider cu congelator si dozator inclus",1,"Gri", 300,289,295, 987,"electrocasnic de bucatarie", -25);

        System.out.println("Numele produsului: " + product.getName());
        System.out.println("Pretul de " + product.getPrice());
        System.out.println("Descriere: " + product.getDescription());
        System.out.println("Cantitate produs: " + product.getQuantity());
        System.out.println("Tipul de produs: " + product.getType());
        System.out.println("Dimensiunii: Lungime: " + product.getLength() + "cm, Latime: " + secondChild.getWidth() + "cm, Inaltime: " + secondChild.getHeight() + "cm.");
        System.out.println("Greutate: " + product.getWeight() + "kg");
        System.out.println(product.getTemperature() + " grade celsius");

    }
}
