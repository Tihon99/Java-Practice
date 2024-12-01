package package2;

import package1.BaseClass;

public class ChildClass extends BaseClass {
    public void testAccess() {
        System.out.println("ChildClass доступ:");
        // privateField;     // Ошибка: private не доступен
        // defaultField;     // Ошибка: default не доступен в другом пакете
        System.out.println(protectedField);  // Доступен в подклассе
        System.out.println(publicField);     // Доступен везде
        
        // privateMethod();    // Ошибка: private не доступен
        // defaultMethod();    // Ошибка: default не доступен в другом пакете
        protectedMethod();     // Доступен в подклассе
        publicMethod();        // Доступен везде
    }
}
