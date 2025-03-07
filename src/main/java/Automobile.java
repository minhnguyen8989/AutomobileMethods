public class Automobile {
    // Attributes
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Method to add a new vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully!";
        } catch (Exception e) {
            return "Error adding vehicle: " + e.getMessage();
        }
    }

    // Method to list vehicle information
    public String[] listVehicleInfo() {
        try {
            String[] vehicleInfo = {
                    "Make: " + this.make,
                    "Model: " + this.model,
                    "Color: " + this.color,
                    "Year: " + this.year,
                    "Mileage: " + this.mileage
            };
            return vehicleInfo;
        } catch (Exception e) {
            return new String[] { "Error listing vehicle: " + e.getMessage() };
        }
    }

    // Method to remove vehicle
    public String removeVehicle() {
        try {
            this.make = null;
            this.model = null;
            this.color = null;
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully!";
        } catch (Exception e) {
            return "Error removing vehicle: " + e.getMessage();
        }
    }

    // Method to update vehicle
    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully!";
        } catch (Exception e) {
            return "Error updating vehicle: " + e.getMessage();
        }
    }
}
