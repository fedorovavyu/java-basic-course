public class Cat {
    private String name;
    private int appetite;
    private int hungry;
    private boolean fullness;

    public Cat(String name, int appetite, int hungry){
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
        this.fullness = true;
    }
    public int getAppetite(){
        return appetite;
    }
    public int getHungry(){
        return hungry;
    }
    public void eat(Plate p) {
        int food = appetite - hungry;
        p.decreaseFood(food);
    }
    public boolean isFullness(){
        return fullness;
    }
    public String getName(){
        return name;
    }
}
