package lesson3;

/*
Создать программу, которая позволяет ввести с клавиатуры массив размером n и отсортировать его по убыванию.
 */

import java.util.Scanner;

public class Task1 {
    static int n;
    public static void main(String[] args) {
        makeMassiveUsingKeybord();
        int array[] = new int [n];
        int el = 0;
        System.out.println("Massive size: " + n);
        for (int i = 0; i < array.length; i++){
            el =+ el + 1;
            System.out.print("Enter element " + el + ": ");
            array[i] = makeMassiveUsingKeybord();
        }
        /*for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Inputed massive: ");*/
    }

    public static int makeMassiveUsingKeybord(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        return n;
    }
     public static String printmassive(){

    }
}
