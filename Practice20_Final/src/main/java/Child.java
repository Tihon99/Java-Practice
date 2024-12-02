public class Child extends Parent {
    // Ошибка компиляции - нельзя переопределить final метод
    /*
    public void finalMethod() {
        System.out.println("Попытка переопределить final метод");
    }
    */
    
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный обычный метод");
    }
}
