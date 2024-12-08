package packageA;

// Класс в том же пакете может реализовать интерфейс с package-private доступом
public class ClassA implements DefaultInterface {
    @Override
    public void method() {
        System.out.println("ClassA реализует DefaultInterface");
    }
}
