public class F1 extends Car {
    public F1(String name, int currentGear) {
        super(name, currentGear);
    }

    public void accelerate(double rate) {
        currentSpeed += rate;
        if (currentSpeed > 250) {
            changeGear(6);
        } else if (currentSpeed > 200) {
            changeGear(5);
        } else if (currentSpeed > 150) {
            changeGear(4);
        } else if (currentSpeed > 100) {
            changeGear(3);
        } else if (currentSpeed > 50) {
            changeGear(2);
        } else {
            changeGear(1);
        }
        System.out.println("Accelerating to speed " + currentSpeed + " in gear " + currentGear);
    }
}
