package HelloWorld;

import java.util.Scanner;

public class LyskrydsChaining
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a color (red, yellow, green): ");
        String color = scanner.nextLine();


        if (color.equals("red")) {
            System.out.println("red light");
        } else if (color.equals("yellow")) {
            System.out.println("yellow light");
        } else if (color.equals("green")) {
            System.out.println("green light");
        }
        else {
            System.out.println("Invalid color");
        }
        scanner.close();








    }
}

