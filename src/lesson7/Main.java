package lesson7;

public class Main {
    public static void main(String[] args){
        Light light = new Light(249, 250, 2075, "Audi", 4, 20,
                "Sedan", 4);
        AutoTruck truck = new AutoTruck(500, 150, 10000, "MAN", 4, 50,
                1000);

        Civil civil = new Civil(2000, 1000, 50000, "Airbus", 50, 1000,
                200, true);

        Military military = new Military(5000, 2000, 10000, "Mirage", 25, 500,
                10, true);

        light.characteristics();
        light.range();

        truck.characteristics();
        truck.truckLoading();

        civil.characteristics();
        civil.passengersCapacity();

        military.characteristics();
        military.isThereCatapulta();
        military.launch();


    }
}
