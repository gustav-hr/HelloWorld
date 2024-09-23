package LogicalOperators;

public class AndOperator {
    public static void main(String[] args) {

        // For en "or operator", så skal begge være true.
        // Det kan ses i dette eksempel:

        int temp = 25;

        if (temp > 30) {
            System.out.println("It is hot outside.");

        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside.");

        } else {
            System.out.println("It is cold outside.");
        }

    }
}