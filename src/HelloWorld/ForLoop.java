package HelloWorld;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        // Total amount of items to scan:
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner (System.in);

        int quantity = scanner.nextInt();

        double total = 0;
        // Create loop to iterate through all the items are accumulate the cost:

        for(int i=0; i<quantity; i++) {
            // The letter "i" is short for "iterate"(gentagelser). When it is set up like this,
            // the program will use the user input for the amount of iterates.

            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" +total);



    }
}
