package CatEat;

public class Cat {
    private String name;
    private int appetit;
    private boolean full;
    public Cat(String name, int appetit){
        this.name = name;
        this.appetit = appetit;
        full = false;
    }
    public void eat(Plate plate) {

        if (plate.satiety(appetit) && !full) {
            System.out.println(name + " кушает.");
            full = true;
            plate.decreaseFood(appetit);
        } else if (!plate.satiety(appetit)) {
            System.out.println(name + "гневно мяукает! В тарелке не достаточно еды!");
        }
         else if (full) {
            System.out.println(name + " сыт и урчит от удовольсвия.");


         }
    }
}

