public class Vehicle {
    protected String name;
    protected double currentSpeed;
    protected double currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(double speed, double direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Moving at speed " + currentSpeed + " in direction " + currentDirection);
    }

    public void steer(double direction) {
        this.currentDirection += direction;
        System.out.println("Steering to direction " + currentDirection);
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("Vehicle stopped");
    }
}
