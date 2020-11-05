public class Dog extends Animal{
    public static int countDogs;
    public Dog(String name){
        super(name);
        countDogs++;
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println(getName() + ", как и все собаки, не может пробежать больше 500м!");
        }
        if (length < 0) {
            System.out.println("Вы ввели отрицательное число. Будьте внимательнее!");
        }
        if (length >=0 && length <= 500) super.run(length);
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println(getName() + ", как и все собаки, может проплыть только 10м!");
        }
        if (length < 0) {
            System.out.println("Вы ввели отрицательное число. Будьте внимательнее!");
        }
        if (length >=0 && length <= 10) super.swim(length);
    }

    @Override
    public void jump(double height) {
        if (height > 0.5) {
            System.out.println(getName() + ", как и все собаки, может прыгнуть только на 0.5м!");
        }
        if (height < 0) {
            System.out.println("Вы ввели отрицательное число. Будьте внимательнее!");
        }
        if (height >=0 && height <= 0.5) super.jump(height);
    }
}
