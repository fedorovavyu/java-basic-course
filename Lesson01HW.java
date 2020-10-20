package ru.geekbrains.lesson01;

/*
...
    1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        ,где a, b, c, d – входные параметры этого метода;
    4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
        от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
        положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true
        , если число отрицательное;
    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль
        сообщение «Привет, указанное_имя!»;
    8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
...
 */
public class Lesson01HW {
    public static void main(String[] args) {

        byte a = 100;
        short b = 5020;
        int c = 10;
        long d = 250L;
        float e = 57.23f;
        double f = 542.453;
        char g = 'g';
        boolean h = true;
        System.out.println(task3(7,4,2,10));
        System.out.println(task4(5.4, 8.2));
        task5(0);
        System.out.println(task6(-5));
        task7("Валюшка");
        task8(2001);

    }

    public static double task3(double a, double b, double c, double d){
        double res = a * (b + (c/d));
        return res;
    }
    public static boolean task4(double a, double b){
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void task5(int a) {
        if (a >= 0) {
            System.out.println(a + " - положительное число");
        } else {
            System.out.println(a + " - отрицательное число");
        }
    }
    public static boolean task6(int a) {
        if (a < 0){
            return true;
        } else {
            return false;
        }
    }
    public  static void task7(String s){
        System.out.println("Привет, " + s + "!");
    }
    public static void task8(int year) {
        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
            System.out.println(year + " - не високосный");
        } else {
            System.out.println(year + " - високосный");
        }
    }
}

