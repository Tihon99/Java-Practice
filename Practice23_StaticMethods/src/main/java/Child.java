public class Child extends Parent {
    // Это не переопределение, а сокрытие (hiding) статического метода
    public static void staticMethod() {
        System.out.println("Статический метод Child");
    }
    
    // Это переопределение обычного метода
    @Override
    public void instanceMethod() {
        System.out.println("Обычный метод Child");
    }
}
