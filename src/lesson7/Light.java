package lesson7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Light extends Ground{
    Scanner sc = new Scanner(System.in);
    private String bodyType;
    private int passengersNumber;

    private int distance;

    public Light (int horsePower, int maxSpeed, int weight, String brand, int wheelsNumber, int fuelComsumption,
                  String bodyType, int passengersNumber) {
        super(horsePower,maxSpeed, weight, brand, wheelsNumber, fuelComsumption);
        this.bodyType = bodyType;
        this.passengersNumber = passengersNumber;
    }


    public String getBodyType(){
        return bodyType;
    }

    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }

    public int getPassengersNumber(){
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber){
        this.passengersNumber = passengersNumber;
    }

    public int getDistance(){
        return distance;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    public double wattPower(){
        double result = getHorsePower() * WATT;
        return result;
    }
    public void characteristics(){
        System.out.println("Output all characteristics related to light car: " + "\nHorse Powers (Hp): "
                + getHorsePower() + "\nMax Speed (km/h): " + getMaxSpeed() + "\nWeight of vehicle (kg): " + getWeight()
                + "\nBrand: " + getBrand() + "\nNumber of wheels: " + getWheelsNumber()
                + "\nFuel Comsumption (l/100km): " + getFuelComsumption() + "\nBody Type: " + getBodyType()
                + "\nNumber of passengers: " + getPassengersNumber() + "\nPower in watts: " + wattPower());
    }

    public void range(){
        System.out.println("Please, input the time to count traveled distance:");
        int time = sc.nextInt();
        int distance = getMaxSpeed() * time;
        setDistance(distance);
        System.out.println("За время " + time + " часа, автомобиль " + getBrand() + " двигаясь с максимальной скоростью "
                + getMaxSpeed() + "км/ч, проедет " + distance + " км " + "и израсходует " + consumedFuel() +
                " литров топлива");

    }

    private double consumedFuel(){
        int comsumption;
        comsumption = (distance / 100) * getFuelComsumption();
        return comsumption;
    }
}
