package KitchenLight;

public class Light {
    boolean status;

    String Name;

    public Light(String nameOfLight) {

        Name = nameOfLight;
    }
    public void displayState() {

        if (status == true) {
            System.out.println("The " +Name + " light is on");
        }
        else {
            System.out.println("The " + Name + " light is off");
        }
    }
    public void setStatus(boolean newStatus) {
        status = newStatus;
    }
}
