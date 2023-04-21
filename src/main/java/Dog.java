public class Dog extends Animal {

    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    //Play with themselves
    @Override
    public void play() {
        System.out.println("The dog, " + name + ", chases a ball");
    }

    //Playing with a toy
    @Override
    public void play(Toy toy) {
        System.out.println("The dog, " + name + ", is trying to eat the " + toy);
    }
}
