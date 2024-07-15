public class Pig extends Animal {
    @Override
    void sound(){
        System.out.println("Oink!");
    }
    void pet(){
        this.sound();
    }
}
