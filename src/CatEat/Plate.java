package CatEat;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetit) {
         if (!satiety(appetit)){

         }
         else
        {
            food = food - appetit;
        }
    }
    public void info() {
        System.out.println("В тарелке: " + food + " грамм корма") ;
    }
    public boolean satiety(int appetit){
        return appetit <= food;

        }

    public void addPortion(int food){
       this.food += food;
    }
}

