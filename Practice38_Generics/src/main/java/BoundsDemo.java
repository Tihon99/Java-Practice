import java.util.ArrayList;
import java.util.List;

public class BoundsDemo {
    // Базовый класс для животных
    static class Animal {
        String name;
        Animal(String name) { this.name = name; }
        @Override
        public String toString() { return name; }
    }
    
    // Подклассы
    static class Dog extends Animal {
        Dog(String name) { super(name); }
    }
    
    static class Cat extends Animal {
        Cat(String name) { super(name); }
    }
    
    // Демонстрация PECS: Producer Extends, Consumer Super
    public static void demonstrateBounds() {
        // Producer (extends) - когда мы читаем из коллекции
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Бобик"));
        dogs.add(new Dog("Шарик"));
        
        // Можем читать Animal из List<? extends Animal>
        printAnimals(dogs); // работает, так как Dog extends Animal
        
        // Consumer (super) - когда мы записываем в коллекцию
        List<Animal> animals = new ArrayList<>();
        addDogs(animals); // работает, так как Animal super Dog
    }
    
    // Producer: использует extends, так как метод только читает животных
    private static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
    
    // Consumer: использует super, так как метод добавляет собак
    private static void addDogs(List<? super Dog> dogs) {
        dogs.add(new Dog("Рекс"));
        dogs.add(new Dog("Барон"));
    }
    
    // Пример с ограничением типа в классе
    static class Cage<T extends Animal> {
        private T animal;
        
        public void put(T animal) {
            this.animal = animal;
        }
        
        public T get() {
            return animal;
        }
    }
}
