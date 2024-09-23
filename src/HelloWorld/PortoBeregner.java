package HelloWorld;

import java.util.Scanner;

public class PortoBeregner
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Angiv brevets vægt i gram: (=<100g, =<250g, =<2000g): ");
        String color = scanner.nextLine();


        if (color.equals("=<100g")) {
            System.out.println("25DKK");
        } else if (color.equals("=<250g")) {
            System.out.println("50DKK");
        } else if (color.equals("=<2000g")) {
            System.out.println("75DKK");
        }
        else {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        }
        scanner.close();








    }
}

