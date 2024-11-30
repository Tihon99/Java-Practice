public class Penguin extends Bird {
    
    public Penguin(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " квакает");
    }
    
    @Override
    public void move() {
        System.out.println(name + " плавает");
    }
}
