import java.util.ArrayList;

public class MyArrayList {

    public static void main(String[] args) {
        // Sådan laver man Arrays:
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[1]);



        // Dette er en ArrayList. Det er noget lettere at holde styr på kvantitet:
        ArrayList fruitList = new ArrayList();

        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        System.out.println(fruitList);

        // Man kan fjerne et vist element ved at gøre sådan:
        fruitList.remove("Mango");

        System.out.println(fruitList);

        // Man kan fjerne alle elementer ved at gøre således:
        // fruitList.clear();


        // fruitList.size(); viser hvor mange elementer der er på listen:
        System.out.println(fruitList.size());

    }
}
