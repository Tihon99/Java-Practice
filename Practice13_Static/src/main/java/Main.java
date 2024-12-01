public class Main {
    public static void main(String[] args) {
        System.out.println("1. Вызов через имя класса:");
        A.printVars();
        
        System.out.println("\n2. Вызов через объект класса:");
        A obj = new A();
        obj.printVars();
        
        System.out.println("\n3. Вызов через другой объект класса:");
        A obj2 = new A();
        obj2.a = 10;
        obj2.printVars();
        
        System.out.println("\n4. Проверка, что статическое поле изменилось для всех:");
        A.printVars();
        obj.printVars();
        
        System.out.println("\n5. Изменение через имя класса:");
        A.b = 20;
        A.printVars();
    }
}
