public class Automobile {
    boolean engineOn = false;

    String brand = "Toyota";
    String model = "Camry";
    String color = "Silver";
    int year = 2010;

    public void vehicleInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public void startEngine() {
        System.out.println("Starting engine");
    }

    public void stopEngine() {
        System.out.println("Stopping engine");
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }


    public static void main(String[] args) {
        Automobile a = new Automobile();
        a.vehicleInformation();
    }
}


