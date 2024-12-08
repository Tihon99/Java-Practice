import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void demonstrateStringJoiner() {
        // Создание StringJoiner с разделителем, префиксом и суффиксом
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        
        // Добавление элементов
        joiner.add("Apple")
              .add("Banana")
              .add("Orange");
              
        System.out.println("1. Базовое использование: " + joiner);
        
        // Создание StringJoiner для построения CSV
        StringJoiner csvJoiner = new StringJoiner(",");
        csvJoiner.add("Name")
                .add("Age")
                .add("City");
                
        System.out.println("2. CSV формат: " + csvJoiner);
        
        // Объединение двух StringJoiner
        StringJoiner joiner2 = new StringJoiner(" | ");
        joiner2.add("First")
               .add("Second");
               
        System.out.println("3. Другой разделитель: " + joiner2);
    }
}
