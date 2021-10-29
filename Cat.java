public  class Cat extends Animal {
    static int count;
       public Cat(String name, int run, int swim) {
    super(name, run, swim);
           count ++;
    }
   @Override
   public  void swim(int maxSwimCat, int maxSwimDog){
       System.out.println(name + " проплыл(а) " + " Коты не плавают!");
    }
}
