package lesson4;

/* Ввести с клавы размер 2-ухмерного массива. Оба значения. Вычесть из суммы элементов 2 строки
сумму побочной диоганали… НО, если матрица не квадратная, то всместо диоганали – сумму 2
столбца. ГЫ
Вывести на экран изначальную матрицу. Значения заполнить рандомом, ограничив до
легчосчитаемого но не ниже значения 5
Вывести каждую сумму отдельно (с пояснение, что оно такое)
Вывести итоговый ответ. */

import java.util.Random;
import java.util.Scanner;


public class Task1 {

    public static int n;
    public static int m;
    public static void main(String[] args) {
        inputArraySize();
        int [][] array = new int[n][m];
        arrayFilling(array);
        outputArray(array);
        matrixCalculations(array);

    }

    public static void inputArraySize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер строки массива: ");
        n = sc.nextInt();
        System.out.println("Введите размер столбцов массива: ");
        m = sc.nextInt();

    }

    public static void arrayFilling(int array[][]){
        Random r = new Random();
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(9);
            }
        }
    }

    public static void outputArray(int array[][]){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixCalculations(int array[][]){

        int sumElementsSecondString = 0;
        for(int i = 1; i < 2; i++){
            for (int j = 0; j < array.length; j++){
                sumElementsSecondString += array[i][j];
            }
        }
        System.out.println("Сумма элементов второй строки: " + sumElementsSecondString);

        int sumSideMatrix = 0;
        int count = array.length - 1;
            for (int i = count; i >= 0; i--){
                sumSideMatrix += array[i][count - i];
            }
        System.out.println("Сумма элементов побочной матрицы: " + sumSideMatrix);

        int sumSecondColumn = 0;
        for(int i = 0; i < array.length; i++){
            for (int j = 1; j < 2; j++){
                sumSecondColumn += array[i][j];
            }
        }
        System.out.println("Сумма элементов второго столбца: " + sumSecondColumn);

        if (n == m){
            int result = sumElementsSecondString - sumSideMatrix;
            System.out.println("Матрица квадратная, результат вычислений: " + result);
        }
        else {
            int result2 = sumElementsSecondString - sumSecondColumn;
            System.out.println("Матрица НЕ квадратная, результат вычислений: " + result2);
        }
    }

}
