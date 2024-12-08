public class ExceptionPropagation {
    public static void demonstrateExceptionHandling() {
        System.out.println("=== Демонстрация обработки исключений ===\n");
        
        try {
            // Вызываем метод, который может сгенерировать исключение
            methodWithCatch();
            
            // Этот код выполнится, так как исключение было перехвачено
            System.out.println("Продолжаем выполнение после перехваченного исключения\n");
            
            // Вызываем метод, который пробросит исключение наверх
            methodWithThrows();
            
            // Этот код не выполнится, так как произойдет аварийное завершение
            System.out.println("Этот код не будет выполнен");
            
        } catch (Exception e) {
            // Этот блок catch не будет выполнен, так как
            // исключение из methodWithThrows не обрабатывается
            System.out.println("Этот catch не будет выполнен");
        }
    }
    
    private static void methodWithCatch() {
        try {
            System.out.println("Попытка деления на ноль...");
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
    
    private static void methodWithThrows() throws IllegalStateException {
        System.out.println("Генерация необрабатываемого исключения...");
        throw new IllegalStateException("Это исключение приведет к аварийному завершению");
    }
}
