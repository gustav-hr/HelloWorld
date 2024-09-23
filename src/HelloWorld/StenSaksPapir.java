import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand=new Random();

        System.out.println("Begin the game by writing start: ");

        String userBegin = scanner.nextLine(); // Scanner hvad brugeren skriver. Derudover bruges der nextline og ikke
        // nextInt, da nextLine er for bogstaver, og nextInt er for tal der skal scannes.

        if ("start".equalsIgnoreCase(userBegin)) {
            System.out.println("Game started! Choose your weapon: Rock, paper, scissors?");

        } else {

            System.out.println("Invalid option - game ended.");
        }

        // DEN VIRKER FOR NU MED AT STARTE SPILLET. -------------------------------------------------------------------

        scanner.nextLine(); // Her fortsætter computeren koden, og sørger for at spillet ikke blo slutter:
        int computerSlag = rand.nextInt(3); // Giver computeren 1-3 muligheder; sten, saks og papir. Skal være random:
        String computerChoice = ""; // Definerer computerChoice
        if (computerSlag == 0) {
            computerChoice = "Rock";
        }
        else if (computerSlag == 1) {
            computerChoice = "Paper";
        }
        else {
            computerChoice = "Scissors";
        }



        System.out.println("Computer chose: " + computerChoice + " \nYou chose: " );










    }
}




