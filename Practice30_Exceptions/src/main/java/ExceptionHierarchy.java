public class ExceptionHierarchy {
    public static void explainExceptions() {
        System.out.println("Иерархия исключений в Java:");
        System.out.println("1. Throwable - базовый класс для всех ошибок и исключений");
        System.out.println("   - Содержит информацию об ошибке и стек вызовов");
        
        System.out.println("\n2. Error - серьезные проблемы, которые приложение не должно пытаться обработать");
        System.out.println("   - OutOfMemoryError - нехватка памяти");
        System.out.println("   - StackOverflowError - переполнение стека");
        
        System.out.println("\n3. Exception - исключения, которые приложение может и должно обрабатывать");
        System.out.println("   - IOException - ошибки ввода-вывода");
        System.out.println("   - SQLException - ошибки при работе с базой данных");
        
        System.out.println("\n4. RuntimeException - исключения, которые могут возникать во время выполнения");
        System.out.println("   - ArithmeticException - арифметические ошибки");
        System.out.println("   - NullPointerException - обращение к null");
        System.out.println("   - ArrayIndexOutOfBoundsException - выход за границы массива");
    }
}
