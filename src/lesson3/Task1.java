package lesson3;

/*
Создать программу, которая позволяет ввести с клавиатуры массив размером n и отсортировать его по убыванию.
 */

import java.util.Scanner;

public class Task1 {
    static int n;
    public static void main(String[] args) {
        System.out.print("Input the massive size: ");
        makeMassiveUsingKeybord();
        int array[] = new int [n];
        int el = 0;
        System.out.println("Massive size: " + n);
        for (int i = 0; i < array.length; i++){
            el =+ el + 1;
            System.out.print("Enter element " + el + ": ");
            array[i] = makeMassiveUsingKeybord();
        }
        printMassive(array);
        sortMassiveByBubbleWay(array);
        printSortedDescMassive(array);


    }

    public static int makeMassiveUsingKeybord(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        return n;
    }
     public static void printMassive(int array[]){
        System.out.print("Your base massive is: ");
         for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length-1){
                System.out.print(",");
            }
        }
         System.out.println();
    }

    public static void sortMassiveByBubbleWay(int array[]){
        for (int i = 0; i < array.length-1; i++){
            for (int k = array.length-1; k > i; k--){
                if (array[k-1] < array[k]) {
                    int tmp = array[k-1];
                    array[k-1] = array[k];
                    array[k] = tmp;
                }
            }
        }
    }

    public static void printSortedDescMassive(int array[]){
        System.out.print("Sorted massive DESC: [");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");


    }
}
