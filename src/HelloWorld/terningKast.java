package HelloWorld;

import java.util.Random;

public class terningKast {

    public static void main(String[] args) {

        Random rand = new Random();

        int Kast1 = rand.nextInt(6) + 1;
        int Kast2 = rand.nextInt(6) + 1;
        int sum = Kast1 + Kast2;

        System.out.println("Summen af de to terningkast er: " + sum);

        System.out.println("Hver især har terningerne slået: " + Kast1 + " og " + Kast2);


        while (sum != 7) {
            System.out.println("Summen er ikke 7. Vi forsøger igen:");


             Kast1 = rand.nextInt(6) + 1;
             Kast2 = rand.nextInt(6) + 1;
             sum = Kast1 + Kast2;

            System.out.println("Denne gang er summen: " +sum);
            if (sum==7) {
                System.out.println("Hver især har terningerne slået: " + Kast1 + " og " + Kast2);
            }
        }
        }


        }


