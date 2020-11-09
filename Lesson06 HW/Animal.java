public class Animal {
    public static int countAnimals;
    protected String name;

    public Animal(String name){
        this.name = name;
        countAnimals++;
    }

    public void run(int length){
        System.out.println(getName() + " пробежал " + length + "м.");
    }

    public void swim(int length){
        System.out.println(getName() + " проплыл " + length + "м.");
    }

    public void jump(double height){
        System.out.println(getName() + " прыгнул на " + height + "м.");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
