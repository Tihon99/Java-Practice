public class Main {
    public static void main(String[] args) {
        try {
            // Корректное создание объекта
            Person person1 = new Person("John", 25);
            System.out.println("Создан: " + person1);
            
            // Попытка создать объект с отрицательным возрастом
            Person person2 = new Person("Alice", -5);
            
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Некорректное значение возраста: " + e.getInvalidAge());
        }
        
        try {
            // Попытка создать объект со слишком большим возрастом
            Person person3 = new Person("Bob", 200);
            
        } catch (InvalidAgeException e) {
            System.out.println("\nОшибка: " + e.getMessage());
            System.out.println("Некорректное значение возраста: " + e.getInvalidAge());
        }
    }
}
