import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void demonstrateRead() {
        // Создаем массив байтов с данными
        byte[] data = "Hello, Input Stream!".getBytes();
        
        // Создаем ByteArrayInputStream из массива байтов
        try (InputStream input = new ByteArrayInputStream(data)) {
            System.out.println("Чтение данных побайтово:");
            int byteData;
            
            // Читаем данные по одному байту, пока не достигнем конца (-1)
            while ((byteData = input.read()) != -1) {
                // Преобразуем байт в символ и выводим
                System.out.print((char) byteData);
            }
            System.out.println();
            
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
    }
}
