package LogicalOperators;
import java.util.Scanner;
public class NotOperator {

    public static void main(String[] args) {

        // I en "not operator" så skal et statement være falskt.
        // En "not operator" er bare et udråbstegn.

        Scanner scanner = new Scanner(System.in);

        System.out.println("The game is ending. Press K to continue the game. Any other key will quit the game. ");
        String response = scanner.next();

        if (!response.equals("K")) {
            System.out.println("You quit the game.");
        }

        else {
            System.out.println("You are still playing the game. Have fun!");
        }
    }
}
