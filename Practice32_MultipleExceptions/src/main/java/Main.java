public class Main {
    public static void main(String[] args) {
        // Демонстрация одинаковой обработки разных исключений
        MultipleExceptionsDemo.demonstrateIdenticalHandling();
        
        try {
            // Демонстрация обработки иерархии исключений
            MultipleExceptionsDemo.demonstrateHierarchicalHandling();
        } catch (Ex1 e) {
            System.out.println("Необработанное исключение в main: " + e.getMessage());
        }
        
        // Демонстрация final в catch
        MultipleExceptionsDemo.demonstrateFinalException();
        
        // Демонстрация вложенных try-catch
        MultipleExceptionsDemo.demonstrateNestedTry();
    }
}
