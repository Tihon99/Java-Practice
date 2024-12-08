public class Main {
    public static void main(String[] args) {
        // Демонстрация try без catch и finally (не скомпилируется)
        FinallyDemo.demonstrateTryWithoutCatchOrFinally();
        
        try {
            // Демонстрация try только с finally (допустимо)
            FinallyDemo.demonstrateTryWithOnlyFinally();
        } catch (RuntimeException e) {
            System.out.println("Перехвачено исключение из demonstrateTryWithOnlyFinally");
        }
        
        // Демонстрация try с двумя finally (не скомпилируется)
        FinallyDemo.demonstrateTryWithTwoFinally();
        
        // Демонстрация корректного использования finally
        FinallyDemo.demonstrateCorrectFinally();
    }
}
