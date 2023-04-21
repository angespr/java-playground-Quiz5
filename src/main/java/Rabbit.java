public class Rabbit extends Animal {
    //private String eyeColor;

    //Constructor for animal characteristics
    public Rabbit(String name, int age) {
        super(name, age);
    }

    //Playing alone
    @Override
    public void play() {
        System.out.println("The rabbit, " + name + ", is chilling");
    }

    //Ignoring the toy
    @Override
    public void play(Toy toy) {
        System.out.println("The rabbit, " + name + ", does not care about the " + toy);
    }
}
