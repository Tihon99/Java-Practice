public class Task2 {
    public static void main(String[] args) {
        Object strObj = "Строка";
        Object intObj = 42;
        String str = "Текст";
        
        System.out.println("strObj instanceof String = " + (strObj instanceof String));
        System.out.println("strObj instanceof Object = " + (strObj instanceof Object));
        System.out.println("intObj instanceof Integer = " + (intObj instanceof Integer));
        System.out.println("str instanceof String = " + (str instanceof String));
        
        Object nullObj = null;
        System.out.println("\nПроверка с null:");
        System.out.println("null instanceof Object = " + (nullObj instanceof Object));
        
        String text = "Тест";
        System.out.println("\nПроверка наследования:");
        System.out.println("text instanceof String = " + (text instanceof String));
        System.out.println("text instanceof Object = " + (text instanceof Object));
    }
}
