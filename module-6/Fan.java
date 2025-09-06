//Tevyah Hanley 09/5/2025 M6 Programming Assignment
//This program makes a fan class with fields and methods to create a fan object.

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";

   
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() { return speed; }
    public boolean isOn() { return on; }
    public double getRadius() { return radius; }
    public String getColor() { return color; }

   
    public void setSpeed(int speed) { this.speed = speed; }
    public void setOn(boolean on) { this.on = on; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    public String toString() {
        return "Fan[speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
    }

    public static void main(String[] args) {

        Fan fan1 = new Fan();
        System.out.println("Default constructor fan: " + fan1);

        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("Argument constructor fan: " + fan2);

        // Show methods
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("red");
        System.out.println("Updated fan1: " + fan1);
    }
}
