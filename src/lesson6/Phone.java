package lesson6;

import java.util.Scanner;

public class Phone {
    int number;
    String model;
    int weight;

    String nameCaller = null;

    public Phone() {

    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone (int number, String model, int weight){
        this(number,model);
        this.weight = weight;
    }


    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setNameCaller (String nameCaller){
        this.nameCaller = nameCaller;
    }
    public String getNameCaller(){
        return nameCaller;
    }

    public static void ReceiveCall(String nameCaller){
        System.out.println("Звонит " + nameCaller);

    }

    public static void numberCaller(){

    }

    public static void ReceiveCall(String nameCaller, int numberCaller){
        System.out.println(nameCaller + " " + numberCaller);
    }

    public static void sendMessage(int ...number){
        int result =0;
        for(int x : number)
            result = x;
        System.out.println(result);

    }
}
