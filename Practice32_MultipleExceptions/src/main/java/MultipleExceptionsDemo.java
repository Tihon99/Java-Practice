public class MultipleExceptionsDemo {
    
    public static void demonstrateIdenticalHandling() {
        System.out.println("\n=== Одинаковая обработка разных исключений ===");
        try {
            // Генерируем случайное число от 0 до 2
            int random = (int) (Math.random() * 3);
            
            switch (random) {
                case 0:
                    // ArithmeticException
                    int result = 10 / 0;
                    break;
                case 1:
                    // NullPointerException
                    String str = null;
                    str.length();
                    break;
                case 2:
                    // ArrayIndexOutOfBoundsException
                    int[] arr = new int[1];
                    arr[1] = 10;
                    break;
            }
        } 
        // Несколько исключений обрабатываются одинаково
        catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }
    }
    
    public static void demonstrateHierarchicalHandling() throws Ex1 {
        System.out.println("\n=== Обработка иерархии исключений ===");
        try {
            // Генерируем случайное число от 0 до 2
            int random = (int) (Math.random() * 3);
            
            switch (random) {
                case 0:
                    throw new Ex3("Исключение Ex3");
                case 1:
                    throw new Ex2("Исключение Ex2");
                case 2:
                    throw new Ex1("Исключение Ex1");
            }
        }
        // Важно: порядок catch блоков от самого специфичного к самому общему
        catch (Ex3 e) {
            System.out.println("Перехвачено Ex3: " + e.getMessage());
        }
        catch (Ex2 e) {
            System.out.println("Перехвачено Ex2: " + e.getMessage());
        }
        catch (Ex1 e) {
            System.out.println("Перехвачено Ex1: " + e.getMessage());
        }
    }
    
    public static void demonstrateFinalException() {
        System.out.println("\n=== Демонстрация final в catch ===");
        try {
            throw new Exception("Тестовое исключение");
        } catch (final Exception e) {
            // final означает, что переменную e нельзя изменить внутри блока catch
            System.out.println("Перехвачено исключение (final): " + e.getMessage());
            
            // Следующая строка вызвала бы ошибку компиляции:
            // e = new Exception("Новое исключение");
        }
    }
    
    public static void demonstrateNestedTry() {
        System.out.println("\n=== Демонстрация вложенных try-catch ===");
        try {
            System.out.println("Внешний try");
            try {
                System.out.println("Внутренний try");
                throw new Exception("Внутреннее исключение");
            } catch (Exception e) {
                System.out.println("Внутренний catch: " + e.getMessage());
                throw new Exception("Новое исключение из внутреннего catch");
            }
        } catch (Exception e) {
            System.out.println("Внешний catch: " + e.getMessage());
        }
    }
}
