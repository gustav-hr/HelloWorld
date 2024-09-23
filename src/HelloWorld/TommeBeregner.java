package HelloWorld;

import java.util.Scanner;

public class TommeBeregner {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


        System.out.println("Indtast længde i tommer for at omregne til cm:");
        double tommer = input.nextDouble();
        final double cm = 2.54;
        // 1 "tomme" = 2.54 CM
        double beregnCm = cm * tommer;

        System.out.println(tommer + " Tommer svarer til " + beregnCm + " centimeter");






    }

}
