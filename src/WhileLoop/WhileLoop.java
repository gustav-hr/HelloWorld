package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Et while-loop kører en kode om og om igen, indtil den får et svar.

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {

            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello" +name);
    }
}
