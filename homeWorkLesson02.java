import java.lang.reflect.Array;
import java.util.Arrays;

public class homeWorkLesson02 {
    public static void main(String[] args) {

        /*
          1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
          С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Task 1. Change array:");
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println("to:");
        System.out.println(Arrays.toString(arr1));

        /*
            2. Задать пустой целочисленный массив размером 8.
            С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = i * 3;
        }
        System.out.println("Task 2.");
        System.out.println(Arrays.toString(arr2));

        /*
            3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
            и числа меньшие 6 умножить на 2;
         */

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("Task 3.");
        System.out.println(Arrays.toString(arr3));

        /*
           4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
           и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++){
                arr4[i][i] = 1;
            }
        }
        System.out.println("Task 4.");
        System.out.println(Arrays.toString(arr4));

        /*
            5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
         */
        int[] arr5 = {2, 10, 5, 0, 1};
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println("Task 5. Array:" + arr5);
        System.out.println("Max = " + max + ", min = " + min);

        /*
            6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
            метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
            Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
            граница показана символами ||, эти символы в массив не входят.
         */
        int[] arr6 = {2, 2, 5, 1, 2, 2, 10, 1};
        System.out.println("Task 6. Check balance for array");
        System.out.println(checkBalance(arr6));

    }

    public static boolean checkBalance(int[] array) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (sum2 == sum1) {
                return true;
            }
            sum2 += array[i];
            sum1 -= array[i];
        }
        return false;

    }
}
