package Indkøbskurv;

public class Main {
    public static void main(String[] args) {

        Vare mælk = new Vare(14.5, "Mælk");
        Ordrelinje linje = new Ordrelinje(mælk, 3);

        System.out.println(mælk.varenavn()+" "+linje.samletPris());

        System.out.println(mælk);

        System.out.println(linje);
// Dette var koden for mælk. Således ser det ud, hvis man vil købe noget andet:

        Vare kloakslam = new Vare(15, "Kloakslam");
        Ordrelinje slam = new Ordrelinje(kloakslam, 2);

        System.out.println(slam);
    }

}
