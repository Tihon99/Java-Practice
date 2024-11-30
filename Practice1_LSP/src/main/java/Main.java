/**
 * Демонстрация принципа подстановки Лисков
 */
public class Main {
    public static void main(String[] args) {
        // Создаем массив птиц
        Bird[] birds = new Bird[] {
            new Penguin("Пингвин Джек"),
            new Sparrow("Воробей Чарли")
        };
        
        // Демонстрация принципа подстановки Лисков:
        // Мы можем работать с разными подтипами через ссылку на базовый тип
        for (Bird bird : birds) {
            System.out.println(bird.makeSound());
            System.out.println(bird.move());
            System.out.println();
        }
    }
}
