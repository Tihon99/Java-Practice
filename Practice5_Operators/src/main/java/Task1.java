public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        a -= 3;
        a *= 2;
        a /= 3;
        a %= 3;
        System.out.println("Результат операций присваивания: " + a);

        int x = 5;
        String result = x > 3 ? "больше" : "меньше";
        System.out.println("5 " + result + " чем 3");

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("|| : " + (b2 || b1));
        System.out.println("&& : " + (b2 && b1));

        int n1 = 5;
        int n2 = 3;
        System.out.println("| : " + (n1 | n2));
        System.out.println("^ : " + (n1 ^ n2));
        System.out.println("& : " + (n1 & n2));

        System.out.println("== : " + (n1 == n2));
        System.out.println("> : " + (n1 > n2));
        System.out.println(">= : " + (n1 >= n2));

        System.out.println(">> : " + (n1 >> 1));
        System.out.println("<< : " + (n1 << 1));

        System.out.println("+ : " + (n1 + n2));
        System.out.println("* : " + (n1 * n2));

        int i = 1;
        System.out.println("Префиксный ++: " + (++i));
        System.out.println("Постфиксный ++: " + (i++));
        System.out.println("Текущее значение: " + i);
        System.out.println("Префиксный --: " + (--i));
        System.out.println("Постфиксный --: " + (i--));
        
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Конкатенация: " + str1 + " " + str2);
        str1 += " Java";
        System.out.println("+=: " + str1);
    }
}
