public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " гавкает");
    }
    
    @Override
    public void move() {
        System.out.println(name + " бежит");
    }
}
