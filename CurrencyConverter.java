
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Hardcoded exchange rates for demonstration purposes
        double usdToEuro = 0.85;
        double usdToGBP = 0.72;
        double usdToINR = 74.16;

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter amount in USD: ");
        double amountInUSD = scanner.nextDouble();

        System.out.println("Select currency to convert to:");
        System.out.println("1. Euro");
        System.out.println("2. British Pound (GBP)");
        System.out.println("3. Indian Rupee (INR)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double convertedAmount = 0.0;
        String currency = "";

        switch (choice) {
            case 1:
                convertedAmount = amountInUSD * usdToEuro;
                currency = "Euro";
                break;
            case 2:
                convertedAmount = amountInUSD * usdToGBP;
                currency = "GBP";
                break;
            case 3:
                convertedAmount = amountInUSD * usdToINR;
                currency = "INR";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println(amountInUSD + " USD is equal to " + convertedAmount + " " + currency);
        scanner.close();
    }
}