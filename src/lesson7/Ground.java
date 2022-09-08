package lesson7;

public abstract class Ground extends Transport{

    private int wheelsNumber;
    private int fuelComsumption;

    public Ground (int horsePower, int maxSpeed, int weight, String brand, int wheelsNumber, int fuelComsumption){
        super(horsePower,maxSpeed, weight,brand);
        this.wheelsNumber = wheelsNumber;
        this.fuelComsumption = fuelComsumption;
    }



    public int getWheelsNumber(){
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber){
        this.wheelsNumber = wheelsNumber;
    }

    public int getFuelComsumption(){
        return fuelComsumption;
    }

    public void setFuelComsumption(int fuelComsumption){
        this.fuelComsumption = fuelComsumption;
    }

}
