package CatEat;

public class Mane {
    public static void main(String[] args){

        Cat[] cats =  {
                new Cat("Муся ", 5),
                new Cat("Барсик ", 10),
                new Cat("Пушок ", 15),
                new Cat("Мурка ", 8)
        };
        Plate myPlate = new Plate(22);
        myPlate.info();
       for (Cat cat: cats){
           cat.eat(myPlate);
           myPlate.info();
       }
     myPlate.addPortion(20);
       for (Cat cat: cats){
            cat.eat(myPlate);
            myPlate.info();}


    }

}
