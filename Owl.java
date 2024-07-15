public class Owl extends Animal implements Flyable {
    @Override
    void sound(){
        System.out.println("Hoot!");
    }
    public void fly() {
        System.out.println("I believe I can flyyy");
    }
    public void glide(){
        System.out.println("I can also glide!");
    }
    void pet(){
        this.sound();
    }

}
