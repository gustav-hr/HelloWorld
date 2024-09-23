package HelloWorld;

public class ArrayOpg {
    public static void main(String[] args) {
        // Opgave 1: Lav int-element med 8 typer variabler

        int[] intArray = new int[8];


        // Opgave 2: Giv det første variabel 34, og det sidste variabel 117.
        intArray[0] = 34;
        intArray[7] = 117;
        // Nu har vi 8 variabler i alt. Den første er 0, den sidste er 117.

        // Opgave 3: Lav et For-Loop der itererer over arrayet og print.

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            // Her printer vi ud, så vi kan se vores variabler.
        }

        // Opgave 5: Lav etarray med Strings, som er 3 elementer langt og indeholder værdierne ”Hej”, ”med” og ”dig”.

        String[] stringArray = {"Hej", "Med", "Dig"};

        // Opgave 6: Lav et for each-loop der itererer over arrayet og udskriver de tre Strings,
        // men med mellemrum imellem (dvs. Hej med dig og ikke Hejmeddig, eller ordene ovenover hinanden).
        for (String word : stringArray) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Opgave 7:
        double[] doubleArray = {3.4, 2.5, 1.2, 6.7};

        System.out.println("Value on index 2; " + doubleArray[2]);
        // Her giver vi vores value nr 2: 1.2 under vores index.

        System.out.println("Length of Array: " +doubleArray.length);
    }
}
