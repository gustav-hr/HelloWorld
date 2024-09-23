package StuderendeOpgave;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hold hold = new Hold();

        Studerende s1 = new Studerende ("Jonathan", "jonathan@mail.dk");
        Studerende s2 = new Studerende ("Alice", "alice@mail.dk");

        hold.tilføjStuderende(s1);
        hold.tilføjStuderende(s2);

        System.out.println(s1);
        System.out.println(s2);


    }
}
