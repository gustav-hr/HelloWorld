package Switches;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String day = "Monday";

        day = day.toLowerCase(Locale.ROOT);
        // Denne kode gør så det bliver ignoreret om der bliver skrevet FRIDAY eller friday.

        switch(day) {
            case "sunday":
                System.out.println("It is sunday!");
                break;
            case "monday":
                System.out.println("It is monday!");
                break;
            case "tuesday":
                System.out.println("It is tuesday!");
                break;
            case "wednesday":
                System.out.println("It is wednesday!");
                break;
            case "thursday":
                System.out.println("It is thursday");
                break;
            case "friday":
                System.out.println("It is friday!");
                break;
            case "saturday":
                System.out.println("It is saturday!");
                break;

            default:
                    System.out.println("That is not a day.");
        }

    }
}
