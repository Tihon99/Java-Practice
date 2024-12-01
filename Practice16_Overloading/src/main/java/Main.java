public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};
        
        System.out.println("1. Вызов через цикл for с типом Number:");
        for (Number n : num) {
            a.printNum(n);
        }
        
        System.out.println("\n2. Прямые вызовы:");
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
