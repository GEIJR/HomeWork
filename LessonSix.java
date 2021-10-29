public class LessonSix {
    public static void main (String[]args){
        Animal myFirstCat = new Cat("Муся", 150, 20);
        Animal mySecondCat = new Cat("Барсик", 12, 15);
        Animal myFirstDog = new Dog("Джек", 15, 50);
        Animal mySecondDog = new Dog("Бобик", 255, 50);

        Animal[] animals = { myFirstCat, mySecondCat, myFirstDog, mySecondDog };
        for (int i = 0; i < animals.length; i++ ){
            animals[i].run( 100, 200);
            animals[i].swim( 100, 200);

        }
        System.out.println("Всего котов: " +  Cat.count);
        System.out.println("Всего собак: " +  Dog.count);
    }
}
