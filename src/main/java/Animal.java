public abstract class Animal implements Action {
    protected String name;
    protected int age;

    //constructor for name and ages of animals
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}