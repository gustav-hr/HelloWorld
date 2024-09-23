package HelloWorld;

import java.util.Scanner;

public class BrevBeregner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Porto-beregner.");
        System.out.println("Indtast brevets vægt i gram:");
        Double vægt = input.nextDouble();

        if (vægt <= 0 || vægt > 2000) {
            System.out.println("Brevets vægt kan vi ikke sende");
            } else {
            if (vægt <= 100) {
                System.out.println("Dit brev koster 25 DKK at sende.");
            } else if (vægt <= 250) {
                System.out.println("Dit brev koster 50 DKK at sende.");
            } else if (vægt <= 2000) {
                System.out.println("Dit brev koster 75DKK at sende.");
            } else {
                System.out.println("Brevets vægt kan vi ikke sende");
            }

            input.close();

        }

      }
    }
