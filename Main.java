package lesson1;

import java.util.Scanner;


public class Main {
    private static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
	    System.out.println("Введите номер задачи домашнего задания урока №1:");
        System.out.println("1. Пустой проект");
        System.out.println("2. Переменные различных типов и их инициализация");
        System.out.println("3. Метод вычисляющий выражение: a * (b + (c / d))");
        System.out.println("4. Метод вычисляющий сумму 2-х чисел в диапозоне 10-20");
        System.out.println("5. Отрицательное или положительное число");
        System.out.println("6. True для отрицательного числа ");
        System.out.println("7. Привет, указанное имя");
        System.out.println("8. Високосный год");
        int task = scaner.nextInt();
        if (task == 1) {
            Numbertask(task);
            level1task1();
        }else if (task == 2){
            Numbertask(task);
            level1task2();
        }else if (task == 3) {
            Numbertask(task);
            level1task3(1, 2, 2, 4);
        }else if (task == 4) {
             Numbertask(task);
            level1task4(-1, -10);
        }else if (task == 5) {
            Numbertask(task);
            level1task5(-2);
        }else if (task == 6) {
            Numbertask(task);
            level1task6(6);
        }else if (task == 7) {
            Numbertask(task);
            level1task7("Ольга");
        }
        else {
            Numbertask(task);
            level1task8(2100);
        }

        scaner.close();
    }
    private static void Numbertask(int task){
        System.out.println("Вы выбрали задачу № " + task);
    }

    private static void level1task1(){
        System.out.println("Привет, я пустой метод");
    }

    private static void level1task2(){
        int a = 5;
        double b = 0.9;
        float c = 0.5f;
        boolean e = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
    }

    private static  void level1task3(float a, float b, float c, float d){
        float result = a * (b + c/d);
        System.out.println(result);
    }

    private static void level1task4(float a, float b){
        float result = a + b;
            if (result >= 10 && result <= 20){
                System.out.println("Сумма True");
            }
            else System.out.println("Сумма False");
    }

    private static void level1task5(int a){
        if (a >= 0){
            System.out.println("Положительное число");
        }
        else System.out.println("Отрицательное число");
    }

    private static void level1task6(int a){
        if (a < 0) {
            System.out.println("True");
        }
        else System.out.println("False");

    }

    private static void level1task7(String a){
         System.out.println("Привет " + a);
    }

    private static void level1task8(int a){
        if (a%4 != 0) {
            System.out.println("Год не високосный");
        }
        else if ((a%100 == 0) && (a%400 != 0)){
            System.out.println("Год не високосный");
        } else  System.out.println("Год високосный");
    }
}
