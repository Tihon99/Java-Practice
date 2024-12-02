public class Cat extends Animal {
    public Cat(String name) {
        super(name);  // Вызов конструктора родителя
    }
    
    @Override
    public void makeSound() {
        super.makeSound();  // Вызов метода родителя
        System.out.println(this.name + " мяукает");  // Использование this
    }
}
