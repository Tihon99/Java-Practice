import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void demonstrateWrite() {
        // Создаем ByteArrayOutputStream для записи данных
        try (OutputStream output = new ByteArrayOutputStream()) {
            String message = "Hello, Output Stream!";
            System.out.println("Запись строки: " + message);
            
            // Записываем каждый символ строки в поток
            for (char c : message.toCharArray()) {
                output.write(c);
            }
            
            // Преобразуем результат в строку и выводим
            String result = output.toString();
            System.out.println("Результат записи: " + result);
            
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }
}
