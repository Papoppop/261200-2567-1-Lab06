public class Main {
    public static void main(String[] args) {
        Duck psyduck = new Duck();
        psyduck.sound();

        Owl butterOwl = new Owl();
        butterOwl.sound();

        psyduck.fly();
        butterOwl.glide();

        psyduck.clean(butterOwl);

        Duck mk = new PekingDuck();
        mk.clean(butterOwl);

        psyduck.pet();
        mk.pet();

    }
}