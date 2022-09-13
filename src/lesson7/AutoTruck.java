package lesson7;

import java.util.Scanner;

public class AutoTruck extends Ground{
    Scanner sc = new Scanner(System.in);

    private int loadCapacity;

    public AutoTruck(int horsePower, int maxSpeed, int weight, String brand, int wheelsNumber, int fuelComsumption,
                     int loadCapacity){
        super(horsePower, maxSpeed, weight, brand, wheelsNumber, fuelComsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity(){
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    public double wattPower(){
        double result = getHorsePower() * WATT;
        return result;
    }

    public void characteristics() {
        System.out.println("Output all characteristics related to Truck car: " + "\nHorse Powers (Hp): "
                + getHorsePower() + "\nMax Speed (km/h): " + getMaxSpeed() + "\nWeight of vehicle (kg): " + getWeight()
                + "\nBrand: " + getBrand() + "\nNumber of wheels: " + getWheelsNumber()
                + "\nFuel Comsumption (l/100km): " + getFuelComsumption() + "\nPower in watts: " + wattPower() +
                "\nLoad capacity of truck: " + getLoadCapacity() + "ton");
    }

    public void truckLoading(){
        System.out.println("Введите количество необходимого для загрузки груза, в тоннах: ");
        int cargo = sc.nextInt();
        if(cargo <= getLoadCapacity()){
            System.out.println("Грузовик загружен!");
        }
        else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }






}
