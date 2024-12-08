public class FinallyDemo {
    
    public static void demonstrateTryWithoutCatchOrFinally() {
        System.out.println("\n=== Try без catch и finally ===");
        System.out.println("Нельзя использовать try без catch или finally!");
        
        // Этот код не скомпилируется:
        /*
        try {
            System.out.println("В блоке try");
        }
        */
    }
    
    public static void demonstrateTryWithOnlyFinally() {
        System.out.println("\n=== Try только с finally ===");
        System.out.println("Try с finally без catch - допустимая конструкция");
        
        try {
            System.out.println("В блоке try");
            throw new RuntimeException("Тестовое исключение");
        } finally {
            System.out.println("В блоке finally - этот код выполнится всегда");
        }
    }
    
    public static void demonstrateTryWithTwoFinally() {
        System.out.println("\n=== Try с двумя finally ===");
        System.out.println("Нельзя использовать try с двумя finally!");
        
        // Этот код не скомпилируется:
        /*
        try {
            System.out.println("В блоке try");
        } finally {
            System.out.println("Первый finally");
        } finally {
            System.out.println("Второй finally");
        }
        */
    }
    
    public static void demonstrateCorrectFinally() {
        System.out.println("\n=== Корректное использование finally ===");
        
        try {
            System.out.println("В блоке try");
            if (Math.random() > 0.5) {
                throw new Exception("Случайное исключение");
            }
        } catch (Exception e) {
            System.out.println("В блоке catch: " + e.getMessage());
        } finally {
            System.out.println("В блоке finally - этот код выполнится всегда");
        }
    }
}
