public class ExplanationDemo {
    public static void explain() {
        System.out.println("Объяснение поведения кода в App.java:");
        System.out.println("1. При загрузке класса App выполняется статический блок инициализации");
        System.out.println("2. В статическом блоке происходит попытка преобразовать строку 'Y-' в число");
        System.out.println("3. Это вызовет NumberFormatException, так как 'Y-' не является допустимым числом");
        System.out.println("4. Поскольку исключение возникает в статическом блоке инициализации:");
        System.out.println("   - Оно оборачивается в ExceptionInInitializerError");
        System.out.println("   - Класс помечается как неинициализированный");
        System.out.println("   - Код в main() никогда не выполнится");
        System.out.println("5. Программа завершится с ошибкой инициализации");
        
        System.out.println("\nПример стека ошибок:");
        System.out.println("java.lang.ExceptionInInitializerError");
        System.out.println("Caused by: java.lang.NumberFormatException: For input string: 'Y-'");
    }
}
