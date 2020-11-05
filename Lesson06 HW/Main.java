import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat("cat1");
        Animal cat2 = new Cat("cat2");
        Animal dog1 = new Dog("dog1");
        Animal dog2 = new Dog("dog2");

        int[] lenRun = {100, 200, 400, 500, 600, -100};
        int[] lenSwim = {5, 10, -10};
        double[] heiJump = {0.1, 0.5, 2, 3, -2};

        //      проверяем котиком
        System.out.println("Проврека котика");
        System.out.println("Какое расстояние пробегает котик?");
        for (int i = 0; i < lenRun.length; i++){
            cat1.run(lenRun[i]);
        }
        System.out.println();
        System.out.println("Какое расстояние проплывает котик?");
        for (int i = 0; i < lenSwim.length; i++){
            cat1.swim(lenSwim[i]);
        }
        System.out.println();
        System.out.println("Как высоко пригает котик?");
        for (int i = 0; i < heiJump.length; i++){
            cat1.jump(heiJump[i]);
        }
        System.out.println();
        //        проверяем собачек
        System.out.println("Проверка песика");
        System.out.println("Какое расстояние пробегает песик?");
        for (int i = 0; i < lenRun.length; i++){
            dog1.run(lenRun[i]);
        }
        System.out.println();
        System.out.println("Какое расстояние проплывает песик?");
        for (int i = 0; i < lenSwim.length; i++){
            dog1.swim(lenSwim[i]);
        }
        System.out.println();
        System.out.println("Как высоко пригает песик?");
        for (int i = 0; i < heiJump.length; i++){
            dog1.jump(heiJump[i]);
        }

        System.out.println();
        System.out.println("Общее количество животных = " + Animal.countAnimals);
        System.out.println("Количество кошек = " + Cat.countCats);
        System.out.println("Количество собак = " + Dog.countDogs);

    }

}
