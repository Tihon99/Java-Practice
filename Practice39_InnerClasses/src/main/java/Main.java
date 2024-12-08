public class Main {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        
        System.out.println("=== Демонстрация создания внутренних классов ===");
        demo.demonstrateCreation();
        
        System.out.println("\n=== Демонстрация доступа к полям ===");
        demo.accessInnerFields();
        
        System.out.println("\n=== Создание публичного внутреннего класса извне ===");
        AccessDemo.PublicInner publicInner = demo.new PublicInner();
        publicInner.accessOuterFields();
        
        // Следующие строки не скомпилируются:
        // AccessDemo.PrivateInner privateInner = demo.new PrivateInner(); // Ошибка: приватный класс
        // AccessDemo.PackageInner packageInner = demo.new PackageInner(); // Ошибка: класс с пакетным доступом
    }
}
