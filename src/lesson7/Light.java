package lesson7;

import java.util.Scanner;

public class Light extends Ground{
    Scanner sc = new Scanner(System.in);
    private String bodyType;
    private int passengersNumber;

    private double wattPower;

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

    public double getWattPower(){
        return wattPower;
    }

    public void setWattPower(double wattPower){
        this.wattPower = wattPower;
    }

    public double wattPower(){
        setWattPower(getHorsePower());
        double result = getWattPower() * 0.74;
        return result;
    }
    public void characteristics(){
        System.out.println("Output all characteristics related to light car: " + "\nHorse Powers (Hp): "
                + getHorsePower() + "\nMax Speed (km/h): " + getMaxSpeed() + "\nWeight of auto (kg): " + getWeight()
                + "\nBrand: " + getBrand() + "\nNumber of wheels: " + getWheelsNumber()
                + "\nFuel Comsumption (l/100km): " + getFuelComsumption() + "\nBody Type: " + getBodyType()
                + "\nNumber of passengers: " + getPassengersNumber() + "\nPower in watts: " + wattPower());
    }

    public void range(){
        int time = sc.nextInt();

    }

    private double consumedFuel(){

    }
}
