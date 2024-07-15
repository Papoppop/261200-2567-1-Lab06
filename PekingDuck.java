public class PekingDuck extends Duck {
    public void beCrispy(){
        System.out.println("Grob Grob (sfx)");
    }

    @Override
    public void clean(Animal animal) { // overriding
        System.out.println("I cannot clean. I died already.");
      }

    void pet(){
        System.out.println("...");
    }
    
}
