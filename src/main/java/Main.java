import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Create an instance of Automobile using parameterized constructor
            Automobile vehicle = new Automobile("Toyota", "Camry", "Blue", 2020, 15000);

            // List vehicle information
            String[] vehicleInfo = vehicle.listVehicleInfo();
            System.out.println("New Vehicle Information:");
            for (String info : vehicleInfo) {
                System.out.println(info);
            }
            System.out.println("------------------");

            // Remove vehicle
            System.out.println(vehicle.removeVehicle());
            System.out.println("------------------");

            // Add a new vehicle
            System.out.println(vehicle.addVehicle("Honda", "Civic", "Red", 2022, 5000));
            System.out.println("------------------");

            // List new vehicle information
            vehicleInfo = vehicle.listVehicleInfo();
            System.out.println("New Vehicle Information:");
            for (String info : vehicleInfo) {
                System.out.println(info);
            }
            System.out.println("------------------");

            // Update vehicle information
            System.out.println(vehicle.updateVehicleAttributes("Ford", "Focus", "Black", 2021, 12000));
            System.out.println("------------------");

            // List updated vehicle information
            vehicleInfo = vehicle.listVehicleInfo();
            System.out.println("Updated Vehicle Information:");
            for (String info : vehicleInfo) {
                System.out.println(info);
            }
            System.out.println("------------------");

            //Display a message asking if the user wants to print the information to a file (Y or N).
            System.out.print("Do you want to print the information to a file? (Y/N): ");
            String userChoice = scanner.nextLine();

            if ("Y".equalsIgnoreCase(userChoice)) {
                printToFile(vehicleInfo);
                System.out.println("Information has been printed to C:\\Temp\\Autos.txt.");
            } else {
                System.out.println("No file will be printed.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to print vehicle information to a file
    public static void printToFile(String[] vehicleInfo) {
        File file = new File("C:\\Temp\\Autos.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (String info : vehicleInfo) {
                writer.write(info + "\n");
            }
        } catch (IOException e) {
            System.out.println("Failed to write to file: " + e.getMessage());
        }
    }

}
