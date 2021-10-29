public class Dog extends Animal {
    static int count;
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        count ++;
    }
}
