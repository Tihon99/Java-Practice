public class Main {
    public static void main(String[] args) {
        // Создаем книги для тестирования equals()
        Book book1 = new Book("1984", "George Orwell", 1949, "978-0451524935");
        Book book2 = new Book("1984", "George Orwell", 1949, "978-0451524935");
        Book book3 = new Book("1984", "George Orwell", 1949, "978-0451524936");
        
        // Тест рефлексивности
        System.out.println("Рефлексивность: " + book1.equals(book1));  // true
        
        // Тест симметричности
        System.out.println("Симметричность: " + 
            (book1.equals(book2) == book2.equals(book1)));  // true
        
        // Тест на null
        System.out.println("Проверка null: " + book1.equals(null));  // false
        
        // Тест с разными ISBN
        System.out.println("Разные ISBN: " + book1.equals(book3));  // false
        
        // Проверка hashCode
        System.out.println("Равные объекты имеют равные hashCode: " + 
            (book1.equals(book2) == (book1.hashCode() == book2.hashCode())));  // true
        
        // Вывод toString
        System.out.println("toString: " + book1);
    }
}
