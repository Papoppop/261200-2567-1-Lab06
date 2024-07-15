public class Duck extends Animal implements Flyable {
    
    @Override
    public void sound() {
        System.out.println("Quack!");
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

    void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal);
    }

    void pet(){
        this.sound();
    }

}
