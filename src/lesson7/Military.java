package lesson7;

public class Military extends Air{
    private int missilesNumber;
    private boolean catapulta;

    public Military(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minRangeLine, int
                    missilesNumber, boolean catapulta){
        super(horsePower, maxSpeed, weight, brand, wingspan, minRangeLine);
        this.missilesNumber = missilesNumber;
        this.catapulta = catapulta;
    }

    public int getMissilesNumber(){
        return missilesNumber;
    }

    public void setMissilesNumber(int missilesNumber){
        this.missilesNumber = missilesNumber;
    }

    public boolean isCatapulta(){
        return catapulta;
    }

    public void setCatapulta(boolean catapulta){
        this.catapulta = catapulta;
    }

    public void characteristics(){
        System.out.println("Output all characteristics related to Military plane: " + "\nHorse Powers (Hp): "
                + getHorsePower() + "\nMax Speed (km/h): " + getMaxSpeed() + "\nWeight of vehicle (kg): " + getWeight()
                + "\nBrand: " + getBrand() + " \nWingspan " + getWingspan() + " \nMinimal range of air line: " +
                getMinRangeLine() + " \nNumber of missiles: " + getMissilesNumber());
    }

    public boolean isThereCatapulta(){
        if(isCatapulta()){
            System.out.println(" Катапультрование прошло успешно!");
        }
        else {
            System.out.println(" У вас нет такой системы");
        }
        return true;
    }

    public int launch(){
        if(getMissilesNumber() != 0){
            System.out.println(" Ракета пошла...");
        }
        else {
            System.out.println(" Боеприпасы отсутствуют");
        }
        return missilesNumber;
    }
}
