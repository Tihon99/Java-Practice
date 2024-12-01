package package1;

public class SamePackageClass {
    public void testAccess() {
        BaseClass base = new BaseClass();
        
        System.out.println("SamePackageClass доступ:");
        // base.privateField;  // Ошибка: private не доступен
        System.out.println(base.defaultField);   // Доступен в том же пакете
        System.out.println(base.protectedField); // Доступен в том же пакете
        System.out.println(base.publicField);    // Доступен везде
        
        // base.privateMethod();   // Ошибка: private не доступен
        base.defaultMethod();      // Доступен в том же пакете
        base.protectedMethod();    // Доступен в том же пакете
        base.publicMethod();       // Доступен везде
    }
}
