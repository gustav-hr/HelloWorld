package HelloWorld;

import java.util.Scanner;

public class BmiBeregner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("BMI-beregner." );
        System.out.println("Indtast højde i meter: ");
        Double højde = input.nextDouble();
        System.out.println("Indtast vægt i kilo:");
        Double vægt = input.nextDouble();

        double bmi = vægt / (højde*højde);

        System.out.println("Din BMI er lig med: " + bmi);
        if (bmi < 18.5)
        { System.out.println("Du er undervægtig");}

        if (bmi >=18.5 && bmi <24.9)
        { System.out.println("Du er normalvægtig");}

        if (bmi >=25 && bmi <29.9)
        { System.out.println("Du er overvægtig");}

        if (bmi >30)
        { System.out.println("Du er svært overvægtig");}

        input.close();

    }

}
