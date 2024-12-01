public class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    public void move() {
        System.out.println("Животное двигается");
    }
    
    public void move(int distance) {
        System.out.println("Животное перемещается на " + distance + " метров");
    }
    
    public void move(int distance, String direction) {
        System.out.println("Животное перемещается на " + distance + " метров в направлении " + direction);
    }
}
