public class Main {
    public static void main(String[] args) {
        // Практика 1: super
        Dog dog = new Dog("Бобик", 3, "Дворняжка");
        dog.makeSound();
        
        // Практика 2: наследование через промежуточный класс
        C c = new C();
        c.method();
        
        // Практика 3: конструкторы с this()
        Example ex = new Example(1, 2, 3);
    }
}
