package lesson5;

public class Main {
    public static void main(String[] args) {
        Computer lenovo = new Computer(true, true, true, 100);
        lenovo.output();
        lenovo.switchOn();
        lenovo.switchOff();
        lenovo.output();
    }
}

