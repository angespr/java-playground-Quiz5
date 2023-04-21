public class Cat extends Animal {

    //constructor with set values
    public Cat(String name, int age) {
        super(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Cat plays with themselves
    @Override
    public void play() {
        System.out.println("The cat, " + name + ", jumps on the table");
    }

    //plays with a toy
    @Override
    public void play(Toy toy) {
        System.out.println("The cat, " + name + ", plays with " + toy);
    }
}