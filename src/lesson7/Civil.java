package lesson7;

import java.util.Scanner;

public class Civil extends Air{
    Scanner sc = new Scanner(System.in);

    int passengerNumber;
    boolean businessClass;

    public Civil(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minRangeLine,
                 int passengerNumber, boolean businessClass){
        super(horsePower, maxSpeed, weight, brand, wingspan, minRangeLine);
        this.passengerNumber = passengerNumber;
        this.businessClass = businessClass;
    }

    public int getPassengerNumber(){
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber){
        this.passengerNumber = passengerNumber;
    }

    public boolean isBusinessClass(){
        return true;
    }

    public void setBusinessClass(boolean businessClass){
        this.businessClass = businessClass;
    }

    public void characteristics(){
        System.out.println("Output all characteristics related to Civil plane: " + "\nHorse Powers (Hp): "
                + getHorsePower() + "\nMax Speed (km/h): " + getMaxSpeed() + "\nWeight of vehicle (kg): " + getWeight()
                + "\nBrand: " + getBrand() + " \nWingspan " + getWingspan() + " \nMinimal range of air line: " +
                getMinRangeLine() + " \nNumber of possible passengers: " + getPassengerNumber() + "\nBusiness class: "
        + isBusinessClass());
    }

    public void passengersCapacity(){
        System.out.println("Please, input number of new passengers: ");
        int pass = sc.nextInt();
        if(pass <= getPassengerNumber()){
            System.out.println("Самолёт заполнен!");
        }
        else{
            System.out.println("Пассажиры не влазят в самолёт");
        }
    }




}
