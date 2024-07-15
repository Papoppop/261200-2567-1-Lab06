public class Fly extends Animal implements Flyable{
    @Override
    void sound(){
        System.out.println("bzzzzzz");
    }
    public void fly() {
        System.out.println("I believe I can flyyy");
    }
    public void glide(){
        System.out.println("I can also glide!");
    }
    public void land(){
        System.out.println("I'm landing on water!");
    }
    void pet(){
        this.sound();
    }

}
