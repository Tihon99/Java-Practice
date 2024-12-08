public class SubClassDemo extends AccessDemo {
    public void testInnerClassAccess() {
        // Можем создать защищенный внутренний класс, так как мы наследник
        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.doSomething();
        
        // Можем создать внутренний класс с пакетным доступом, так как мы в том же пакете
        PackageInner packageInner = new PackageInner();
        packageInner.doSomething();
        
        // Следующая строка не скомпилируется:
        // PrivateInner privateInner = new PrivateInner(); // Ошибка: приватный класс недоступен
    }
}
