package NestedLoops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol= "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        // Her sætter vi et for-loop ind.

        for(int i=1; i<=rows; i++) {
            System.out.println(); // Denne "SOUT" flytter vores markør på computeren ned på linjen efter.
            // Her laver vi endnu et for-loop, der er inde i det allerede-eksisterende for-loop:
            for(int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }

    }
}
