package HelloWorld;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) +1;
        // Denne sætning generer et tilfældigt tal mellem 1-10

        System.out.println("Pick a number between 1-10");

        int usersGuess = scanner.nextInt();

        while (numberToGuess != usersGuess) {
        // Denne sætning sørger for at så længe brugerens gæt ikke er korrekte svar, at man får et forsøg mere.

            System.out.println("Try again");

            if(usersGuess > numberToGuess) {
                System.out.println("Number is too big.");

            }else {
                System.out.println("Number is too low");
            }
            // if-else her sørger for at give brugeren besked om at tallet man har gættet på, er for lavt eller for højt.

            usersGuess = scanner.nextInt();
            // Denne sætning sørger for at loopet ikke kører uendeligt.


        }

        System.out.println("Correct answer. The answer was " + numberToGuess);


        }
    }


