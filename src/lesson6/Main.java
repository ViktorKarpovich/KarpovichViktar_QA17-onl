package lesson6;
/*Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.  Добавить в класс Phone методы: receiveCall, имеет один параметр –
имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов. Добавить конструктор, который принимает на вход два параметра для
инициализации переменных класса - number, model. Добавить конструктор без параметров. Вызвать из конструктора с
тремя параметрами конструктор с двумя.Добавьте перегруженный метод receiveCall, который принимает два параметра
 - имя звонящего и номер телефона звонящего. Вызвать этот метод. Создать метод sendMessage с аргументами переменной
 длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 Метод выводит на консоль номера этих телефонов.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone number = new Phone();
        Phone model = new Phone();
        Phone weight = new Phone();

        //вызов методов для обьекта number
        number.setNumber(sc.nextInt());
        System.out.println(number.getNumber());
        number.setNameCaller("Viktor");
        number.ReceiveCall(number.getNameCaller());
        //вызов методов для обьекта model
        model.setNumber(sc.nextInt());
        System.out.println(model.getNumber());
        model.setNameCaller("Alexandra");
        model.ReceiveCall(model.getNameCaller());
        //вызов методов для обьекта weight
        weight.setNumber(sc.nextInt());
        System.out.println(weight.getNumber());
        weight.setNameCaller("Bear");
        weight.ReceiveCall(weight.getNameCaller());

        number.ReceiveCall(number.nameCaller, number.getNumber());
        model.ReceiveCall(model.nameCaller, model.getNumber());
        weight.ReceiveCall(weight.nameCaller, weight.getNumber());

        number.sendMessage(number.getNumber());
        model.sendMessage(model.getNumber());
        weight.sendMessage(weight.getNumber());

    }
}
