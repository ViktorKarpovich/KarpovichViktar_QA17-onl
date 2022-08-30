package lesson4;

/* Ввести с клавы размер 2-ухмерного массива. Оба значения. Вычесть из суммы элементов 2 строки
сумму побочной диоганали… НО, если матрица не квадратная, то всместо диоганали – сумму 2
столбца. ГЫ
Вывести на экран изначальную матрицу. Значения заполнить рандомом, ограничив до
легчосчитаемого но не ниже значения 5
Вывести каждую сумму отдельно (с пояснение, что оно такое)
Вывести итоговый ответ.
Для звёздочки, если квадратная - вывести индекс и значение ее центра, если центр невыявляем,
сделать матрицу пригодной (удалить столбец справа и предпоследнюю строку) для этого и
вывести получившуюся. А если неквадратная – сделать ее размер равным наименшему значению
и найти центр.*/

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
        if(n == m){
            matrixCalculations(array);
        }
        taskWithStar(array);

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
        System.out.println();
    }


    public static void matrixCalculations(int array[][]){

        int sumElementsSecondString = 0;
        for(int i = 1; i < 2; i++){
            for (int j = 0; j < array[i].length; j++){
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

    public static void taskWithStar(int array[][]){
        if (n % 2 != 0 & m % 2 != 0){
            int index = (m-1)/2;
            System.out.printf("\nИндекс центра матрицы [%d][%d] и число по этому индексу: ", index, index);
            System.out.print(array[index][index]);
        }
        else if (n % 2 != 0.5 & m % 2 != 0){
            for (int i = 0; i < n-1; i++){
                for (int j = 0; j < n-1; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
                indexMatrix(array);
            }
            indexMatrix(array);
            System.out.println("Матрица обрезана, результат новой матрицы");
        }

        else if (n % 2 != 0 & m % 2 != 0.5) {
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Матрица обрезана, результат новой матрицы");
            indexMatrix(array);
        }
        else {
            for (int i = 0; i < n-2; i++) {
                System.out.println();
                for (int j = 0; j < m-1; j++)
                    System.out.print(array[i][j] + " ");
            }
            for (int i = n-1; i < n; i++) {
                System.out.println();
                for (int j = 0; j < m-1; j++)
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
            System.out.println("Матрица обрезана, результат новой матрицы");
            indexMatrix(array);
        }
    }

    public static void indexMatrix(int array[][]) {
        int index = (m-1)/2;
        System.out.printf("\nИндекс центра матрицы [%d][%d] и число по этому индексу: ", index, index);
        System.out.print(array[index][index]);
    }


}
