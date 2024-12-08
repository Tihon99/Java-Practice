public class Main {
    public static void main(String[] args) {
        // Практика 1: Демонстрация работы с default и static методами
        ConsolePrinter printer = new ConsolePrinter();
        
        // Вызов абстрактного метода
        printer.print("Hello");
        
        // Вызов default метода (переопределенного)
        printer.printWithPrefix("World");
        
        // Вызов статического метода
        Printer.printInfo();
        
        // Практика 2: Демонстрация множественного наследования
        MultipleInterfaces multi = new MultipleInterfaces();
        multi.commonMethod();
    }
}
