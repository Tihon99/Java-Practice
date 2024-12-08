package packageB;

import packageA.PublicInterface;

// Класс в другом пакете может реализовать только public интерфейс
public class ClassB implements PublicInterface {
    @Override
    public void method() {
        System.out.println("ClassB реализует PublicInterface");
    }
}
