public class Main {
    public static void main(String[] args) {
        // Практика 1: Инициализация элементов перечисления
        System.out.println("Практика 1:");
        Month december = Month.DECEMBER;
        System.out.println("В " + december + " " + december.getDays() + " дней");

        // Практика 2: Перечисление с дополнительным методом
        System.out.println("\nПрактика 2:");
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription());
        }
    }
}
