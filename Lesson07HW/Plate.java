public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public int getFood(){
        return food;
    }
    public void info(){
        System.out.println("Тарелка заполнена на: " + food);
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int n){
        food += n;
        System.out.println("В миску положили " + n + " корма");
    }
    public boolean isPlateEmpty(int n){
        return (food - n) <= 0 ;
    }
//    public boolean isPlateEmpty(int n){
//        if (food - n <= 0){
//            return true;
//        }
//        return false;
//    }

//

//    public int setFood(int i){
//        return i;
//    }
}
