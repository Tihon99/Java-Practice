public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация InputStream ===");
        InputStreamDemo.demonstrateRead();
        
        System.out.println("\n=== Демонстрация OutputStream ===");
        OutputStreamDemo.demonstrateWrite();
        
        System.out.println("\n=== Демонстрация AutoCloseable ===");
        AutoCloseableDemo.demonstrateCustomAutoCloseable();
    }
}
