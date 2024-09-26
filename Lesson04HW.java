import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Lesson04HW {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '-', DOT_X = 'x', DOT_O = 'o';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Крестики-нолики 3Х3");
        initMap();
        printMap();
        while (true) {
            userStep();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("вы победили");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiStep();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }

    //метод заполняет поле пустыми ячейками через -
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }// конец метода initMap

    //метод для вывода игрового поля
    public static void printMap(){
        //обозначаем цифры для ячеек поля по горизонтали
        for (int i = 0; i < SIZE; i++) {
            System.out.print("  " + (i+1));
        }
        System.out.println();
        //выводим поле и цифры для ячеек по вертикали
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }// конец метода printMap

    // определяем шаг пользователя
    public static void userStep(){
        int x, y;
        do{
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellFree(x, y));
        map[x][y] = DOT_X;
    }// конец метода userStep

    // проверка на занятое место
    public static boolean isCellFree(int x, int y){
        if (map[x][y] == DOT_EMPTY) return true;
        else if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        return false;
    }//конец метода

    // определяем ход компьютера
    public static void aiStep(){
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellFree(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }//конец метода

    // проверка победы
    public static boolean checkWin(char symb) {
        int diagCount = 0, diagSideCount = 0;
        for (int i = 0; i < SIZE; i++){
            int rowCount = 0, columnCount = 0;
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == symb) {
                    rowCount++;
                    if (rowCount == SIZE) return true;
                }
                if (map[j][i] == symb) {
                    columnCount++;
                    if (columnCount == SIZE) return true;
                }
            }
            if (map[i][i] == symb) {
                diagCount++;
                if (diagCount == SIZE) return true;
            }
            if (map[i][SIZE - i - 1] == symb) {
                diagSideCount++;
                if (diagSideCount == SIZE) return true;
            }
        }
        return false;
    }//конец метода checkWin

    // проверка на заполненные ячейки
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }



}
