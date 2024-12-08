import java.util.ArrayList;
import java.util.List;

public class InstanceofDemo {
    public static void demonstrateInstanceof() {
        // Создаем разные списки
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        
        // Проверяем с помощью instanceof
        System.out.println("stringList instanceof List: " + (stringList instanceof List));
        System.out.println("stringList instanceof ArrayList: " + (stringList instanceof ArrayList));
        
        // Важно: нельзя проверить конкретный тип параметра из-за стирания типов
        // Это не скомпилируется: if (stringList instanceof List<String>)
        
        // Но можно проверить базовый тип
        if (stringList instanceof List) {
            System.out.println("stringList это List");
        }
        
        // Можно проверить конкретную реализацию
        if (stringList instanceof ArrayList) {
            System.out.println("stringList это ArrayList");
        }
    }
}
