public class Main {
    public static void main(String[] args) {
        // Демонстрация почему нет полиморфизма для статических методов
        Parent parent = new Parent();
        Parent child = new Child();    // Ссылка типа Parent на объект Child
        
        // Статические методы вызываются на основе типа ссылки
        parent.staticMethod();         // "Статический метод Parent"
        child.staticMethod();          // "Статический метод Parent"
        
        // Обычные методы вызываются на основе типа объекта
        parent.instanceMethod();       // "Обычный метод Parent"
        child.instanceMethod();        // "Обычный метод Child"
        
        // Правильный способ вызова статических методов
        Parent.staticMethod();         // "Статический метод Parent"
        Child.staticMethod();          // "Статический метод Child"
    }
}
