public class Cow extends Animal {
    @Override
    void sound(){
        System.out.println("Moo!");
    }
    void pet(){
        this.sound();
    }
}