package Mealprice;

public class MealPrice {
    public static double calculateTotalMealPrice (double listedPrice, double tipRate, double taxRate) {

        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;

    }

    public static void main(String[] args) {
        double groupTotalMealCost = calculateTotalMealPrice(100, 0.2, 0.08);
        System.out.println("The total cost is: $" +groupTotalMealCost);

        double individualTotalMealCost = groupTotalMealCost / 5;
        System.out.println("The individual price of the meal is: $" +individualTotalMealCost);

    }
}
