package burtscher.OO.Car;

import java.util.Scanner;

public class Car {
    private Tire tires;
    private Engine engine;
    private RearMirror mirror;
    private int fuelConsumption;
    private int fuelAmount;
    private int fuelVolume;
    private String brand;
    private String model;
    private String serialNumber;
    private String color; 



    public Car(int fuelConsumption, int fuelAmount, int fuelVolume, String brand, String model, String serialNumber, String color){
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.fuelVolume = fuelVolume;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
    }



    public void drive(){
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println(this.serialNumber + " Is currently diving");
    }
    public void brake(){
        String brake;
        brake = "Ich bremse";
        System.out.println(brake);
    }

    public void turboBoost(){
        if(this.fuelVolume*0.1 < this.fuelAmount){
            System.out.println("SuperBoostMode activated");
        } else{
            System.out.println("Not enough fuel to go to Superboost.");
        }
    }

    public void honk(){
        System.out.println("Please enter the Amount of times you want to honk");
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        for (int amountOfRepetitions = 0;  amountOfRepetitions < amount; amountOfRepetitions++) {
            System.out.println("TUUUUUUUUUUUT");
        }
    }

    public void getRemainingRange(){
        int remainingRange = this.fuelAmount/this.fuelConsumption;
        System.out.println("There are about " + remainingRange*100 + "km of Range remaining");
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }


    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

