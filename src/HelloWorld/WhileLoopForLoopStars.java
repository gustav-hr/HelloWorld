package HelloWorld;

import java.util.Scanner;
public class WhileLoopForLoopStars {
    public static void main(String[] args) {
        /*OPGAVE
        Udkommenter al koden i main-metoden, og skriv programmet om sådan at det bruger et for-loop i stedet for et while-loop.
        Skriv din kode herunder: ----------------------------------------------------------------------------------------------------
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvor mange stjerner vil du udskrive?");

        int amountofStars = scan.nextInt();
        int count = 0;
        for(int i=0; i<amountofStars; i++) {
            System.out.println("*");
            count++;
        }






        //-----------------------------------------------------------------------------------------------------------------------
    }
}