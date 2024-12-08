public class StringBufferDemo {
    public static void demonstrateStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        
        // Те же методы, что и у StringBuilder, но потокобезопасные
        
        // 1. append() - потокобезопасное добавление
        sb.append(" World");
        System.out.println("1. После append: " + sb);
        
        // 2. insert() - потокобезопасная вставка
        sb.insert(5, ",");
        System.out.println("2. После insert: " + sb);
        
        // 3. delete() - потокобезопасное удаление
        sb.delete(5, 7);
        System.out.println("3. После delete: " + sb);
        
        // 4. reverse() - потокобезопасный разворот
        sb.reverse();
        System.out.println("4. После reverse: " + sb);
        sb.reverse();
        
        // 5. replace() - потокобезопасная замена
        sb.replace(5, 10, "Java");
        System.out.println("5. После replace: " + sb);
    }
}
