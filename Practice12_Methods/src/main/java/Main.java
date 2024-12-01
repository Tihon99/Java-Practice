public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация перегрузки методов:");
        Animal animal = new Animal("Животное");
        animal.move();
        animal.move(5);
        animal.move(10, "север");
        
        System.out.println("\nДемонстрация переопределения методов:");
        Animal cat = new Cat("Мурка");
        Animal dog = new Dog("Бобик");
        
        cat.makeSound();
        cat.move();
        
        dog.makeSound();
        dog.move();
        
        System.out.println("\nУнаследованные перегруженные методы:");
        cat.move(3);
        cat.move(7, "юг");
        
        dog.move(4);
        dog.move(8, "запад");
    }
}
