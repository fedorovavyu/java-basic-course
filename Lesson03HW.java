import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesso03HW {
    public static void main(String[] args) {
        /*
        1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
        угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
        чем загаданное, или меньше. После победы или проигрыша выводится запрос –
        «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        */


        //guessNumber();

        /*
           2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
           "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
           "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
         */
        //guessWord();


    }

    // Метод для первой задачи
    public  static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите целое число от 0 до 9. У вас 3 попытки");
            int i = 0;
            Random rand = new Random();
            int randNumber = rand.nextInt(10);
            while (i < 3){
                System.out.println((i+1) + "-ая поптыка");
                i += 1;
                int number = sc.nextInt();
                if ((number < 0) || (number > 9)) {
                    System.out.println("вы ввели число, не входящее в интервал");
                    continue;
                }
                if (number == randNumber) {
                    System.out.println("Вы угадали!");
                    break;
                } else {
                    if (number > randNumber) System.out.println("Введеное число больше заданного");
                    else System.out.println("Введеное число меньше заданного");
                }
            }
            System.out.println("Правильное число = " + randNumber);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int userAnswer = sc.nextInt();
            if (userAnswer == 0) break;
            else System.out.println("Продолжаем игру :)");
        }
    }

    // Метод для второй задачи
    public static void guessWord(){
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random randomWord = new Random();
        int wordIndex = randomWord.nextInt(words.length-1);
        String word = words[wordIndex];

        System.out.println("Угадайте, какое слово загадно из списка:\n " +
                "apple, orange, lemon, banana, apricot, avocado, broccoli, carrot, \n" +
                "cherry, garlic, grape, melon, leak,  kiwi ,  mango ,  mushroom , \n" +
                " nut ,  olive ,  pea ,  peanut ,  pear ,  pepper ,  pineapple ,  pumpkin ,  potato ");
        while (true) {
            //System.out.println(word);
            String userWord = sc.nextLine();
            String[] array = {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"};
            if (userWord.toLowerCase().equals(word)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                int wordLength = 0;

                if (userWord.length() >= word.length() ){
                    wordLength = word.length();
                } else wordLength = userWord.length();
                for (int i = 0; i < wordLength ; i++){
                    if (userWord.charAt(i) == word.charAt(i)) {
                        array[i] = String.valueOf(word.charAt(i));
                    }
                }

                System.out.println("Вы не угадали. Попробуйте снова. Буквы,которые совпали");
                System.out.println(String.join("", array));
            }
        }

    }

}
