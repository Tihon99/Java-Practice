public class AccessDemo {
    private String outerPrivate = "Внешнее приватное поле";
    protected String outerProtected = "Внешнее защищенное поле";
    public String outerPublic = "Внешнее публичное поле";
    
    // Публичный внутренний класс - доступен отовсюду
    public class PublicInner {
        private String innerField = "Внутреннее поле";
        
        public void accessOuterFields() {
            // Внутренний класс имеет доступ ко всем полям внешнего класса
            System.out.println("Public inner accessing:");
            System.out.println(" - " + outerPrivate);
            System.out.println(" - " + outerProtected);
            System.out.println(" - " + outerPublic);
        }
    }
    
    // Защищенный внутренний класс - доступен в пакете и наследникам
    protected class ProtectedInner {
        protected void doSomething() {
            System.out.println("Protected inner doing something");
        }
    }
    
    // Пакетный внутренний класс (default) - доступен только в пакете
    class PackageInner {
        void doSomething() {
            System.out.println("Package inner doing something");
        }
    }
    
    // Приватный внутренний класс - доступен только внутри внешнего класса
    private class PrivateInner {
        private void doSomething() {
            System.out.println("Private inner doing something");
        }
    }
    
    // Метод внешнего класса для доступа к полям внутреннего класса
    public void accessInnerFields() {
        PublicInner inner = new PublicInner();
        System.out.println("Outer accessing inner field: " + inner.innerField);
        
        // Создание и использование приватного внутреннего класса
        PrivateInner privateInner = new PrivateInner();
        privateInner.doSomething();
    }
    
    // Демонстрация создания объектов внутренних классов
    public void demonstrateCreation() {
        // Внутри внешнего класса можно создавать объекты всех внутренних классов
        PublicInner publicInner = new PublicInner();
        ProtectedInner protectedInner = new ProtectedInner();
        PackageInner packageInner = new PackageInner();
        PrivateInner privateInner = new PrivateInner();
        
        // Вызов методов
        publicInner.accessOuterFields();
        protectedInner.doSomething();
        packageInner.doSomething();
        privateInner.doSomething();
    }
}
