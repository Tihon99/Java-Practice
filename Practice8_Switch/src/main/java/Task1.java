public class Task1 {
    public static void main(String[] args) {
        byte byteVal = 1;
        switch (byteVal) {
            case 1:
                System.out.println("byte: 1");
                break;
            default:
                System.out.println("byte: other");
        }

        short shortVal = 2;
        switch (shortVal) {
            case 2:
                System.out.println("short: 2");
                break;
            default:
                System.out.println("short: other");
        }

        char charVal = 'A';
        switch (charVal) {
            case 'A':
                System.out.println("char: A");
                break;
            default:
                System.out.println("char: other");
        }

        int intVal = 3;
        switch (intVal) {
            case 3:
                System.out.println("int: 3");
                break;
            default:
                System.out.println("int: other");
        }

        String strVal = "test";
        switch (strVal) {
            case "test":
                System.out.println("String: test");
                break;
            default:
                System.out.println("String: other");
        }

        enum Day { MONDAY, TUESDAY }
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("enum: MONDAY");
                break;
            default:
                System.out.println("enum: other");
        }
    }
}
