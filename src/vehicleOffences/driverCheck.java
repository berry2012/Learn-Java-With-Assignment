package vehicleOffences;
import java.util.Scanner;

public class driverCheck {
    private static final String[] VEHICLE_TYPE = {
            "AM: Mopeds and Light quadricycles",
            "A1: Motorcycles with an engine capacity not exceeding 125 cubic centimetres, with a power rating not exceeding 11 kW",
            "A2: Motorcycles with a power rating not exceeding 35 kW",
            "A: Motorcycles",
            "A: Motor tricycles.",
            "B: Vehicles (other than motorcycles, mopeds, work vehicles or land tractors) having a MAM1 not exceeding 3,500 kg",
            "BE: Combination of drawing vehicles in category B and trailer where the MAM¹ of the trailer is not greater than 3,500 kg.",
            "W: Work vehicles (other than land tractors) ",
            "C: Vehicles (other than work vehicles or land tractors) having a MAM¹ exceeding 3,500 kg",
            "CE: Combination of drawing vehicles in category C and trailer where the MAM¹ of the trailer is greater than 750 kg",
            "C1: Vehicles in category C having a MAM¹ weight not exceeding 7,500 kg",
            "C1E: Combination of drawing vehicles in category C1 or B",
            "D: Vehicles designed and constructed for the carriage of more than eight passengers in addition to the driver",
            "DE: Combination of drawing vehicles in category D and trailer where the MAM¹ of the trailer is greater than 750 kg",
            "D1: Vehicles in category D designed and constructed for the carriage of not more than sixteen passengers",
            "D1E: Combination of drawing vehicles in category D1 and trailer where the MAM¹ of the trailer is greater than 750 kg"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printVehicleTypes();
        int vehicle = getVehicle(scanner);
        int age = getAge(scanner);
        int minAge = getMinimumAge(vehicle);

        if (minAge == -1) {
            System.out.println("Invalid vehicle number");
        } else if (age >= minAge) {
            System.out.println("You are " + age + " years old, and you are of age to drive in Ireland");
            System.out.println("Minimum age is " + minAge);
        } else {
            System.out.println("You are not of age to drive in Ireland");
            System.out.println("Minimum age for this vehicle type is " + minAge);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the driver's license number:");
        String driverLicenseNumber = sc.nextLine();
        System.out.println("Proceed to check if driver's license number: " + driverLicenseNumber + " is valid");

        sc.close();

    }

    private static void printVehicleTypes() {
        System.out.println("Instructions: Choose number representing vehicle type\n");
        for (int i = 0; i < VEHICLE_TYPE.length; i++) {
            System.out.println((i + 1) + ". " + VEHICLE_TYPE[i]);
        }
        System.out.println();
    }

    private static int getVehicle(Scanner scanner) {
        System.out.println("Choose your vehicle type:");
        return scanner.nextInt();
    }

    private static int getAge(Scanner scanner) {
        System.out.println("Enter your age:");
        return scanner.nextInt();
    }

    private static int getMinimumAge(int vehicle) {
        switch (vehicle) {
            case 1:
            case 2:
            case 8:
                return 16;
            case 3:
            case 11:
            case 12:
                return 18;
            case 4:
            case 13:
            case 14:
                return 24;
            case 5:
            case 9:
            case 10:
            case 15:
            case 16:
                return 21;
            case 6:
            case 7:
                return 17;
            default:
                return -1;
        }
    }
}
