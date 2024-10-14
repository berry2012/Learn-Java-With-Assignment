package vehicleOffences;
import java.util.Scanner;

public class vehicleRoadworthinessOpt {
    private static final String[] SUB_CATEGORY = {
            "Using a vehicle with defective or worn tyres",
            "Using a vehicle (car) without valid test certificate (NCT)",
            "Driving vehicle before remedying dangerous defect",
            "Driving dangerously defective vehicle",
            "Using commercial vehicle without certificate of roadworthiness"
    };

    private static final String[] FINES = {
            "The fine is €80 if paid within 28 days of the offence or €120 if paid in the subsequent 28 days. A third payment option is also available",
            "The fine is €60 if paid within 28 days of the offence or €90 if paid in the subsequent 28 days. A third payment option is also available",
            "The fine is decided by the court.",
            "The fine is decided by the court.",
            "The fine is decided by the court."
    };

    private static final String[] PENALTIES = {
            "2 penalty points on payment of the fine or 4 Penalty points on conviction.",
            "3 penalty points on payment of the fine or 5 penalty points on conviction.",
            "Mandatory court appearance and 3 penalty points upon conviction.",
            "Mandatory court appearance and 5 penalty points upon conviction.",
            "Mandatory court appearance and 5 penalty points upon conviction."
    };

    public static void main(String[] args) {
        printInstructions();
        int offenceType = getOffenceType();

        if (offenceType < 1 || offenceType > 5) {
            System.out.println("Invalid option selected.");
            return;
        }

        int index = offenceType - 1;
        System.out.println("Selected offence is: " + SUB_CATEGORY[index] + "\n");
        System.out.println("Penalty: " + PENALTIES[index]);
        System.out.println("Fine: " + FINES[index]);
    }

    private static void printInstructions() {
        System.out.println("Instructions: Choose between option 1 to 5 for the respective offence category.\n");
        for (int i = 0; i < SUB_CATEGORY.length; i++) {
            System.out.println((i + 1) + ". " + SUB_CATEGORY[i]);
        }
        System.out.println();
    }

    private static int getOffenceType() {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a number for the offence type: ");
        int offenceType = input.nextInt();
        input.close();
        return offenceType;
    }
}

