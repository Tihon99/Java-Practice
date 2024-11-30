/**
 * Базовый класс Bird, определяющий основное поведение птиц
 */
public abstract class Bird {
    protected String name;
    
    public Bird(String name) {
        this.name = name;
    }
    
    // Все птицы могут издавать звуки
    public abstract String makeSound();
    
    // Все птицы могут двигаться
    public abstract String move();
}
