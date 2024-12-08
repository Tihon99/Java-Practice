public class Main {
    public static void main(String[] args) {
        System.out.println("=== Базовое форматирование ===");
        BasicFormatting.demonstrateBasicFormatting();
        
        System.out.println("\n=== Форматирование даты и времени ===");
        DateTimeFormatting.demonstrateDateTimeFormatting();
        
        System.out.println("\n=== Демонстрация flush() ===");
        BasicFormatting.explainFlush();
    }
}
