package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private boolean isOn;
    private boolean cpu;
    private boolean ram;
    private boolean hardDisk;
    private int cycles;


    public Computer(boolean cpu, boolean ram, boolean hardDisk, int cycles){
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.cycles = cycles;
    }

    public void output (){
        String output = "";
        StringBuilder sb = new StringBuilder();
        if (cpu){
            sb.append("[\"есть\", ");
        }
        else {
            sb.append("[\"нет\", ");
        }

        if (ram){
            sb.append("\"есть\", ");
        }
        else {
            sb.append("\"нет\", ");
        }

        if (hardDisk){
            sb.append("\"есть\", ");
        }
        else {
            sb.append("\"нет\", ");
        }
        sb.append(cycles + "циклов]");
        System.out.println(sb);
    }

    public boolean switchOn(){
        if(isOn){
            System.out.println("Компьютер уже включён");
            return false;
        }
        if(cycles == 0){
            System.out.println("Компьютер мёртв");
            return false;
        }
        if(!hasCpu() || !hasRam() || !hasHardDisk()){
            System.out.println("Проверь компоненты компьютеры, что-то отсутствует");
            return false;
        }
        if(random()){
            isOn = true;
            System.out.println("Повезло, компьютер жив");
            return true;
        }
            return true;

    }

    public boolean switchOff(){
        if(!isOn){
            System.out.println("Компьютер не включен");
            return false;
        }
        if(!random()){
            isOn = false;
            cycles--;
            System.out.println("Компьютер выключен");
            return true;
        }
        return true;
    }

    public boolean hasCpu(){
        if(!cpu){
            System.out.println("Процессор отсутствует");
            return false;
        }
        return true;
    }

    public boolean hasRam(){
        if(!ram){
            System.out.println("Оперативка отсутствует");
            return false;
        }
        return true;
    }

    public boolean hasHardDisk(){
        if(!hardDisk){
            System.out.println("Жёсткий диск отсутствует");
            return false;
        }
        return true;
    }

    public boolean random (){
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        if(ran.nextInt(2) == sc.nextInt()){
            return false;
        }
        return true;
    }

    public boolean isCpu(){
        return cpu;
    }

    public void setCpu(boolean cpu) {
        this.cpu = cpu;
    }

    public boolean isRam() {
        return ram;
    }

    public void setRam(boolean ram) {
        this.ram = ram;
    }

    public boolean isHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(boolean hardDisk) {
        this.hardDisk = hardDisk;
    }
}
