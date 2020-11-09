public class CatEat {
    public final static int FOOD = 200;
    public static void main(String[] args) {
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Борчик", 10, 2);
        cat[1] = new Cat("Мотя", 8, 0);
        cat[2] = new Cat("Тимочка", 14, 0);
        cat[3] = new Cat("Джекуля", 12, 5);

        Plate plate = new Plate(FOOD);
        plate.info();
        for (Cat i : cat){
            if (plate.isPlateEmpty(i.getAppetite())) {
                System.out.println("Мало еды в тарелке! Положите еще корма!");
                plate.increaseFood(FOOD);
            } else {
                if (i.getHungry() == 0) {
                    i.eat(plate);
                    System.out.println(i.getName() + ", голоден и решил поесть!");
                    plate.info();
                    i.isFullness();
                }
                if (i.getHungry() > 0) System.out.println(i.getName() + " пока не голоден");

            }
        }


        //plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
