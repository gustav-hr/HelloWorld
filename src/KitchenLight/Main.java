package KitchenLight;

public class Main {
    public static void main(String[] args) {
        Light theKitchenLight = new Light("Kitchen");
        Light theRoomLight = new Light("Dining table");

        theKitchenLight.setStatus(true);
        theKitchenLight.displayState();

        theRoomLight.setStatus(false);
        theRoomLight.displayState();


    }
}

