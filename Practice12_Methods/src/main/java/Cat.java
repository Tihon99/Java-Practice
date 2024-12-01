public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " мяукает");
    }
    
    @Override
    public void move() {
        System.out.println(name + " крадется");
    }
}
