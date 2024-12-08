public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
    // Переопределяем default метод
    @Override
    public void printWithPrefix(String message) {
        System.out.println("Console: " + message);
    }
}
