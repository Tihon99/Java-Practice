public class Main {
    public static void main(String[] args) {
        // Практика 1: Перегрузка методов
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));        // int версия
        System.out.println(calc.add(1.5, 2.5));    // double версия
        System.out.println(calc.add(1, 2, 3));     // версия с тремя параметрами
        
        // Практика 2: Переопределение методов
        Animal animal = new Dog();
        System.out.println(animal.getType());  // Вызовется версия Dog
        animal.makeSound();                    // Вызовется версия Dog
        
        // Практика 3: @Override поможет найти ошибку в Cat
        Cat cat = new Cat();
        cat.makeSound();  // Вызовется метод Animal, а не Cat
    }
}
