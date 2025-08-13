import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How much water do you have in kilograms?");
        double water = input.nextDouble();

        System.out.print("What is the first temperature in Celsius?");
        double firstTemperature = input.nextDouble();

        System.out.print("What is the last temperature in Celsius?");
        double lastTemperature = input.nextDouble();

        double energy = water * (lastTemperature - firstTemperature) * 4184;

        System.out.println("You need about " + energy + " energy to hear the water in Joules.");

        input.close();
    }
}