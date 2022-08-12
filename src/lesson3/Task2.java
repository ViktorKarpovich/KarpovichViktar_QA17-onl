package lesson3;
/* Постройте частотный словарь букв русского (или английского) алфавита.
Т.е. Сколько раз каждая бука алфавита повторяется в введенной строке.
Alphabet.put(“A”, 0)*/

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> Aphabet = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String enteredString = sc.next();
        for (int i = 0; i < enteredString.length(); i++){
            Character A = enteredString.charAt(i);
            Integer number = Aphabet.get(A);
            if(number == null){
            Aphabet.put(A, 1);
            }else{
            Aphabet.put(A, number+1);
            }
        }
        System.out.println(Aphabet);
    }

}
