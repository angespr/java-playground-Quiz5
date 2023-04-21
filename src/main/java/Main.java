public class Main {
    public static void main(String[] args) {
        // CAT
        Cat coco = new Cat("Coco", 14);
        //coco.play();

        // DOG
        Dog max = new Dog("Max", 5, "Angie");
        //max.play();

        // RABBIT
        Rabbit snowflake = new Rabbit("Snowflake", 2);
        //snowflake.play();

        // TOYS
        Toy legoCar = new Toy("Lego Car");

        // ANIMALS
        Action[] homeFriends = new Action[]{coco, max, snowflake, legoCar};
        for (Action friend : homeFriends) {
            friend.play(legoCar);
        }
    }
}