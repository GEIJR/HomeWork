public  class Animal {
    protected String name;
    protected int run;
    protected int swim;

    public Animal(String name,int run,int swim){
        this.name = name;
        this.run = run;
        this.swim = swim;

    }
    public void run(int maxRunCat, int maxRanDog){
        if ((run < maxRunCat)&&(run < maxRanDog)){
            System.out.println(name + " пробежал(а) " + run + " м ");
        } else  System.out.println(name + " пробежал(а) " + " Слишком большое расстояние! ");

    }
    public  void swim(int maxSwimCat, int maxSwimDog){
        if ((swim < maxSwimCat)&&(swim < maxSwimDog)){
            System.out.println(name + " проплыл(а) " + run + " м ");
        } else  System.out.println(name + " проплылл(а) " + " Слишком большое расстояние! ");
    }

}




