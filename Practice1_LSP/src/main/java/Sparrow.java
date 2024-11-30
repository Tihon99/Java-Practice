public class Sparrow extends Bird {
    
    public Sparrow(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " чирикает");
    }
    
    @Override
    public void move() {
        System.out.println(name + " летает");
    }
}
