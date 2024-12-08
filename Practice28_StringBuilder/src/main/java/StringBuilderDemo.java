public class StringBuilderDemo {
    public static void demonstrateStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавление в конец
        sb.append(" World");
        System.out.println("1. После append: " + sb);
        
        // 2. insert() - вставка в указанную позицию
        sb.insert(5, ",");
        System.out.println("2. После insert: " + sb);
        
        // 3. delete() - удаление диапазона
        sb.delete(5, 7);  // удаляем ", "
        System.out.println("3. После delete: " + sb);
        
        // 4. reverse() - переворачивание строки
        sb.reverse();
        System.out.println("4. После reverse: " + sb);
        sb.reverse(); // возвращаем обратно
        
        // 5. replace() - замена диапазона
        sb.replace(5, 10, "Java");
        System.out.println("5. После replace: " + sb);
        
        // 6. substring() - получение подстроки
        String sub = sb.substring(0, 5);
        System.out.println("6. Подстрока: " + sub);
        
        // 7. length() - получение длины
        System.out.println("7. Длина: " + sb.length());
        
        // 8. capacity() - получение емкости буфера
        System.out.println("8. Емкость: " + sb.capacity());
        
        // 9. charAt() - получение символа по индексу
        System.out.println("9. Символ по индексу 1: " + sb.charAt(1));
        
        // 10. setCharAt() - установка символа по индексу
        sb.setCharAt(0, 'h');
        System.out.println("10. После setCharAt: " + sb);
    }
}
