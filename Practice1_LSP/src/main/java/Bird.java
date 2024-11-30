public abstract class Bird {
    String name;
    
    public Bird(String name) {
        this.name = name;
    }
    
    public abstract void makeSound();
    public abstract void move();
}
