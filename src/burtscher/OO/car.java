package burtscher.OO;

import java.util.Scanner;

public class car {
    public int fuelconsumtion;
    public String brand;
    public String serialnumber;
    public String color;
    public int getFuelAmount;
    public int fuelAmount;
    private double fuelVolume;


    public void brake() {
        String brake;
        brake = "Ich bremse";
        System.out.println(brake);
    }

    public void turboboost() {
        if (this.fuelVolume * 0.1 < this.fuelAmount) {
            System.out.println("SuperBoostMode activated");
        } else {
            System.out.println("Not enouth fuel to go to SuperBoost");
        }
        System.out.println();
    }

    public void honk() {
        System.out.println("Please enter amount of times you want to honk");
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        for (int amountOfRepetitions = 0; amountOfRepetitions < amount; amountOfRepetitions++) {
            System.out.println("TuuuuT");
        }
    }

    public void getRemainingRange() {
        int remainingRange = this.fuelAmount/this.fuelconsumtion;
        System.out.println("There are about " + remainingRange*100 + "km of Range remaining");
    }

}
