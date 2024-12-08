import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerDemo {
    public static void demonstrateFileScanning() {
        // Создаем тестовый файл с данными
        createTestFile();
        
        // Путь к файлу
        String filePath = "test_data.txt";
        
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
    
    private static void createTestFile() {
        try (PrintWriter writer = new PrintWriter("test_data.txt")) {
            writer.println("42 ответ");
            writer.println("на главный вопрос жизни,");
            writer.println("73 следующее простое число");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при создании тестового файла: " + e.getMessage());
        }
    }
}
