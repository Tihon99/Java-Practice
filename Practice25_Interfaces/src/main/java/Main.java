import packageA.ClassA;
import packageB.ClassB;

public class Main {
    public static void main(String[] args) {
        // Демонстрация работы с интерфейсами разной видимости
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        
        classA.method();
        classB.method();
    }
}
