package lesson3;

/*
Создать программу, которая позволяет ввести с клавиатуры массив размером n и отсортировать его по убыванию.
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int n = makeMassiveUsingKeybord();
        System.out.println("Massive size: " + n);
    }

    public static int makeMassiveUsingKeybord(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}
