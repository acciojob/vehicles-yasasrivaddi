public class Car extends Vehicle {
    private int currentGear;

    public Car(String name, int currentGear) {
        super(name);
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Changed gear to " + currentGear);
    }

    public void changeSpeed(double newSpeed, double newDirection) {
        move(newSpeed, newDirection);
        System.out.println("Speed changed to " + newSpeed + " in direction " + newDirection);
    }
}
