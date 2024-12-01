public class Task2 {
    public static void main(String[] args) {
        System.out.println("Пример с break:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        
        System.out.println("\n\nПример с continue:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        
        System.out.println("\n\nПример с while и break:");
        int i = 0;
        while (true) {
            if (i >= 5) {
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        
        System.out.println("\n\nПример с do-while и continue:");
        i = 0;
        do {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        } while (i < 10);
    }
}
