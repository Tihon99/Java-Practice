public class StringMethods {
    public static void demonstrateStringMethods() {
        String str = "  Hello, World!  ";
        
        // 1. length() - получение длины строки
        System.out.println("1. Длина строки: " + str.length());
        
        // 2. trim() - удаление пробелов в начале и конце
        System.out.println("2. После trim(): '" + str.trim() + "'");
        
        // 3. substring() - получение подстроки
        System.out.println("3. Подстрока (7-12): " + str.substring(7, 12));
        
        // 4. toLowerCase() - преобразование в нижний регистр
        System.out.println("4. В нижнем регистре: " + str.toLowerCase());
        
        // 5. toUpperCase() - преобразование в верхний регистр
        System.out.println("5. В верхнем регистре: " + str.toUpperCase());
        
        // 6. replace() - замена символов
        System.out.println("6. Замена 'l' на 'L': " + str.replace('l', 'L'));
        
        // 7. contains() - проверка наличия подстроки
        System.out.println("7. Содержит 'World': " + str.contains("World"));
        
        // 8. indexOf() - поиск позиции подстроки
        System.out.println("8. Позиция 'World': " + str.indexOf("World"));
        
        // 9. split() - разделение строки на массив
        String[] parts = str.split(",");
        System.out.println("9. Первая часть после split: " + parts[0]);
        
        // 10. isEmpty() - проверка на пустоту
        System.out.println("10. Строка пустая?: " + str.isEmpty());
    }
}
