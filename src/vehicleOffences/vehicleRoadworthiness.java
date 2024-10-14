package vehicleOffences;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vehicleRoadworthiness {
    public static void main(String[] args) {
        System.out.println("Instructions: Choose between option 1 to 5 for the respective offence category.\n\n" +
                "1. Using a vehicle with defective or worn tyres\n" +
                "2. Using a vehicle (car) without valid test certificate (NCT)\n" +
                "3. Driving vehicle before remedying dangerous defect\n" +
                "4. Driving dangerously defective vehicle\n" +
                "5. Using commercial vehicle without certificate of roadworthiness\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a number for the offence type: ");
        int offenceType = input.nextInt();  // Read user input
        String vehicleType = "non-commercial";
        String[] subCategory = {"Using a vehicle with defective or worn tyres",
                "Using a vehicle (car) without valid test certificate (NCT)",
                "Driving vehicle before remedying dangerous defect",
                "Driving dangerously defective vehicle",
                "Using commercial vehicle without certificate of roadworthiness"};

        String fine = "";

        switch (offenceType) {
            case 1:
                fine = "The fine is €80 if paid within 28 days of the offence or €120 if paid in the subsequent 28 days. A third payment option is also available";
                break;
            case 2:
                fine = "The fine is €60 if paid within 28 days of the offence or €90 if paid in the subsequent 28 days. A third payment option is also available";
                break;
            case 3:
                fine = "The fine is decided by the court.";
                break;
            case 4:
                fine = "The fine is decided by the court.";
                break;
            case 5:
                fine = "The fine is decided by the court.";
                break;
            default:
                System.out.println("Choose a number from 1 to 5 for the respective offence category.\n.");
        }

        switch (offenceType) {
            case 1:
                System.out.println("Selected offence is: " + subCategory[0] + "\n");
                System.out.println("Penalty: 2 penalty points on payment of the fine or 4 Penalty points on conviction.\n");
                System.out.println("Fine: " + fine);
                break;
            case 2:
                System.out.println("Selected offence is: " + subCategory[1] + "\n");
                System.out.println("Penalty: 3 penalty points on payment of the fine or 5 penalty points on conviction.\n");
                System.out.println("Fine: " + fine);
                break;
            case 3:
                System.out.println("Selected offence is " + subCategory[2] + "\n");
                System.out.println("Penalty: Mandatory court appearance and 3 penalty points upon conviction.");
                System.out.println("Fine: " + fine);
                break;
            case 4:
                System.out.println("Selected offence is: " + subCategory[3] + "\n");
                System.out.println("Penalty: Mandatory court appearance and 5 penalty points upon conviction.");
                System.out.println("Fine: " + fine);
                break;
            case 5:
                System.out.println("Selected offence is: " + subCategory[4] + "\n");
                System.out.println("Penalty: Mandatory court appearance and 5 penalty points upon conviction.");
                System.out.println("Fine: " + fine);
                break;
            default:
                System.out.println("Invalid option selected.");
        }

        input.close();
    }
}
