public class Car {

    private int displacement;
    private String plate;
    private String brand;
    private String model;


    public Car(int displacement, String plate, String brand, String model) {
        this.displacement = displacement;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }


    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int cilindrata) {
        this.displacement = cilindrata;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String targa) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String marca) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modello) {
        this.model = model;
    }

    public static void main(String[] args) {

        Car auto1 = new Car(2000, "AB123CD", "Fiat", "500");


        System.out.println("Cilindrata: " + auto1.getDisplacement());
        System.out.println("Targa: " + auto1.getPlate());
        System.out.println("Marca: " + auto1.getBrand());
        System.out.println("Modello: " + auto1.getModel());


    }
}
