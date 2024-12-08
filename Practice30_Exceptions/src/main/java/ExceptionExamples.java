public class ExceptionExamples {
    public static void demonstrateExceptions() {
        try {
            // 1. ArithmeticException
            System.out.println("\nArithmeticException:");
            int result = 10 / 0;  // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            // 2. ArrayIndexOutOfBoundsException
            System.out.println("\nArrayIndexOutOfBoundsException:");
            int[] arr = new int[3];
            arr[5] = 10;  // Выход за границы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            // 3. IllegalArgumentException
            System.out.println("\nIllegalArgumentException:");
            validateAge(-5);  // Передаем некорректный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            // 4. ClassCastException
            System.out.println("\nClassCastException:");
            Object obj = "Hello";
            Integer num = (Integer) obj;  // Неверное приведение типов
        } catch (ClassCastException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            // 5. NullPointerException
            System.out.println("\nNullPointerException:");
            String str = null;
            int length = str.length();  // Вызов метода у null
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }

    private static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
