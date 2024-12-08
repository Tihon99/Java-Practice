public interface Calculator {
    // Константы интерфейса доступны вложенному классу
    double PI = 3.14159;
    
    // Методы интерфейса
    double calculate();
    
    // Вложенный класс для вычисления площади круга
    class Circle implements Calculator {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public double calculate() {
            return PI * radius * radius;
        }
    }
    
    // Вложенный класс для вычисления площади квадрата
    class Square implements Calculator {
        private double side;
        
        public Square(double side) {
            this.side = side;
        }
        
        @Override
        public double calculate() {
            return side * side;
        }
    }
    
    // Вложенный класс с утилитными методами
    class Utils {
        public static void printResult(Calculator calculator) {
            System.out.printf("Площадь фигуры: %.2f%n", calculator.calculate());
        }
    }
}
