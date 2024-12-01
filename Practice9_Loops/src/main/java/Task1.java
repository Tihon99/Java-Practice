public class Task1 {
    public static void main(String[] args) {
        System.out.println("Бесконечный while:");
        int i = 0;
        while (true) {
            System.out.println("Итерация " + i++);
            if (i > 2) break;
        }
        
        System.out.println("\nБесконечный do-while:");
        i = 0;
        do {
            System.out.println("Итерация " + i++);
            if (i > 2) break;
        } while (true);
        
        System.out.println("\nАльтернативный вариант while:");
        i = 0;
        while (i >= 0) {
            System.out.println("Итерация " + i++);
            if (i > 2) break;
        }
        
        System.out.println("\nАльтернативный вариант do-while:");
        i = 0;
        do {
            System.out.println("Итерация " + i++);
            if (i > 2) break;
        } while (i >= 0);
    }
}
