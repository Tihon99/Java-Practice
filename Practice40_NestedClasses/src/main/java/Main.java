public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация вложенных классов в интерфейсе ===");
        
        // Создание объектов вложенных классов
        Calculator circle = new Calculator.Circle(5);
        Calculator square = new Calculator.Square(4);
        
        // Использование вложенного утилитного класса
        System.out.println("Круг с радиусом 5:");
        Calculator.Utils.printResult(circle);
        
        System.out.println("\nКвадрат со стороной 4:");
        Calculator.Utils.printResult(square);
        
        // Прямой доступ к константе интерфейса
        System.out.println("\nЗначение PI из интерфейса: " + Calculator.PI);
    }
}
