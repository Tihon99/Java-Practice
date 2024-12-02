public class C extends B {
    void method() {
        int a = super.a;  // Получит значение из класса A
        super.method();   // Вызовет метод из класса A
    }
}
