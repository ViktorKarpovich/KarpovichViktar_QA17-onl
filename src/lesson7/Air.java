package lesson7;

public abstract class Air extends Transport {
    private int wingspan;
    private int minRangeLine;

    public Air(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minRangeLine){
        super(horsePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRangeLine = minRangeLine;

    }

    public int getWingspan(){
        return wingspan;
    }

    public void setWingspan(int wingspan){
        this.minRangeLine = wingspan;
    }

    public int getMinRangeLine(){
        return minRangeLine;
    }

    public void setMinRangeLine(int minRangeLine){
        this.minRangeLine = minRangeLine;
    }
}
