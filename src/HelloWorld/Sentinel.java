package HelloWorld;

import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast tal der skal lægges sammen, eller tast: (-1) for at stoppe.");

        int SENTINEL = -1;
        int sum = 0;

        while (true) {
            System.out.println("Indtast et tal: ");
            int number = scanner.nextInt();

            if (number == SENTINEL) {
                break;
            }

            sum += number;
        }

        System.out.println("Summen af det indtastede tal er: " + sum);
        scanner.close();
    }

}
