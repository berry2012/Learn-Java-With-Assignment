import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String firstName;

        System.out.println("Enter your first name: ");
        firstName = myObj.nextLine();  // Read user input

        System.out.printf("Hello " + firstName + " and welcome!\n" +
                "This is just a brief intro to describe the start of this project!\n");
        }
}