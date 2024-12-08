import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void demonstrateAutoCloseable() {
        // Пример использования try-with-resources с AutoCloseable
        String fileName = "test.txt";
        
        // BufferedReader реализует AutoCloseable
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            System.out.println("Прочитана строка: " + line);
            
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        // Ресурс reader будет автоматически закрыт после выхода из try блока
    }
    
    // Пример собственного класса, реализующего AutoCloseable
    public static class Resource implements AutoCloseable {
        public Resource() {
            System.out.println("Ресурс создан");
        }
        
        public void doSomething() {
            System.out.println("Ресурс используется");
        }
        
        @Override
        public void close() {
            System.out.println("Ресурс освобожден");
        }
    }
    
    public static void demonstrateCustomAutoCloseable() {
        // Использование собственного AutoCloseable ресурса
        try (Resource resource = new Resource()) {
            resource.doSomething();
        }
        // Метод close() будет вызван автоматически
    }
}
