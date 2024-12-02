public class B extends A {
    void test() {
        System.out.println(a1);       // Доступно в том же пакете
        System.out.println(a2);       // Доступно везде
        System.out.println(a3);       // Доступно наследникам
        // System.out.println(a4);    // Недоступно - private
        
        method1();    // Доступно в том же пакете
        method2();    // Доступно везде
        method3();    // Доступно наследникам
        // method4(); // Недоступно - private
    }
}
