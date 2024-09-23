package LogicalOperators;

import java.util.Scanner;

public class OrOperator {

    public static void main(String[] args) {

        // I en "or operator" så skal enten det ene eller det andet statement være true.
        // Man skriver "or" ved disse: ||.

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game. Press Q or K to quit the game. ");

        String response = scanner.next();

        if (response.equals("Q") || response.equals("K")) {
            System.out.println("You quit the game.");
        }

        else {
            System.out.println("You are still playing the game. Have fun!");
        }
    }
}
