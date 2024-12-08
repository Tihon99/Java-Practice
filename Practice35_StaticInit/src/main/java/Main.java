public class Main {
    public static void main(String[] args) {
        try {
            // Попытка обратиться к классу App вызовет ошибку инициализации
            App.main(args);
        } catch (ExceptionInInitializerError e) {
            System.out.println("Поймана ошибка: " + e.getClass().getName());
            System.out.println("Причина: " + e.getCause().getMessage());
        }
    }
}
