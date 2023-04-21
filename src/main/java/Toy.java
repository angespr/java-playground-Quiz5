public class Toy implements Action {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Toy " + name + " is making some weird sound");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("The Robot is happy to see " + toy);
    }

    @Override
    public String toString() {
        return name;
    }
}

