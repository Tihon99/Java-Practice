package package2;

import package1.BaseClass;

public class DifferentPackageClass {
    public void testAccess() {
        BaseClass base = new BaseClass();
        
        System.out.println("DifferentPackageClass доступ:");
        // base.privateField;    // Ошибка: private не доступен
        // base.defaultField;    // Ошибка: default не доступен в другом пакете
        // base.protectedField;  // Ошибка: protected не доступен в другом пакете без наследования
        System.out.println(base.publicField);  // Доступен везде
        
        // base.privateMethod();    // Ошибка: private не доступен
        // base.defaultMethod();    // Ошибка: default не доступен в другом пакете
        // base.protectedMethod();  // Ошибка: protected не доступен в другом пакете без наследования
        base.publicMethod();        // Доступен везде
    }
}
