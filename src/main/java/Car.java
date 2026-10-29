public class Car {
    private String name = "";
    private int speed = 0;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    String getName() {
        return name;
    }

    int getSpeed() {
        return speed;
    }
}
