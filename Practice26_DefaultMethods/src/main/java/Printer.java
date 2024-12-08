public interface Printer {
    // Абстрактный метод
    void print(String message);
    
    // Default метод
    default void printWithPrefix(String message) {
        System.out.println("Prefix: " + message);
    }
    
    // Статический метод
    static void printInfo() {
        System.out.println("Это интерфейс Printer");
    }
}
