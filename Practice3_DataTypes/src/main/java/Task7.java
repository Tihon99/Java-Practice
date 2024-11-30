public class Task7 {
    public static void main(String[] args) {
        int a = 120;
        // byte b = a + 10;  // Ошибка компиляции
        byte c = (byte)(a + 10);  // c = -126, потому что 130 больше максимального значения byte (127)
                                 // происходит переполнение и значение идет в отрицательную сторону
        // byte d = a + 1;   // Ошибка компиляции
        
        System.out.println("c = " + c);
    }
}
