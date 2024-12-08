import java.util.Formatter;

public class BasicFormatting {
    public static void demonstrateBasicFormatting() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        
        // 1. %b - логическое значение
        formatter.format("Boolean: %b%n", true);
        
        // 2. %c - символ
        formatter.format("Character: %c%n", 'A');
        
        // 3. %d - целое число
        formatter.format("Integer: %d%n", 42);
        
        // 4. %f - число с плавающей точкой
        formatter.format("Float: %.2f%n", 3.14159);  // .2 означает 2 знака после запятой
        
        // 5. %s - строка
        formatter.format("String: %s%n", "Hello World");
        
        // Вывод всех отформатированных строк
        System.out.println(sb.toString());
        
        // Закрываем formatter и очищаем буфер
        formatter.flush();
        formatter.close();
    }
    
    public static void explainFlush() {
        // Демонстрация необходимости flush()
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        
        // Записываем данные в буфер
        formatter.format("Some data");
        
        // flush() гарантирует, что все данные записаны
        // и буфер очищен
        formatter.flush();
        
        // Особенно важно при работе с файлами или сетью,
        // чтобы гарантировать, что все данные записаны
        formatter.close();
    }
}
