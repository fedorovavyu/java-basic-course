public class Cat extends Animal{
    public static int countCats;
    public Cat(String name){
        super(name);
        countCats++;
    }
    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println(getName() + ", как и все коты, не может пробежать больше 200м!");
        }
        if (length < 0) {
            System.out.println("Вы ввели отрицательное число. Будьте внимательнее!");
        }
        if (length >=0 && length <= 200) super.run(length);
    }

    @Override
    public void swim(int length) {
        if (length >= 0) {
            System.out.println(getName() + ", как и все коты, не умеет плавать!");
        }
        if (length < 0) {
            System.out.println("Вы ввели отрицательное число. Будьте внимательнее!");
        }
    }

    @Override
    public void jump(double height) {
        if (height > 2.0) {
            System.out.println(getName() + ", как и все коты, может прыгнуть только на 2м!");
        }
        if (height < 0) {
            System.out.println("Вы ввели отрицательное число. Будьте внимательнее!");
        }
        if (height >=0 && height <= 2.0) super.jump(height);
    }



    

}
