public class Task1 {
    public static void main(String[] args) {
        Integer dec = Integer.decode("100");
        Integer hex = Integer.decode("0xFF");
        Integer oct = Integer.decode("0100");
        Integer neg = Integer.decode("-100");
        
        System.out.println(dec);
        System.out.println(hex);
        System.out.println(oct);
        System.out.println(neg);
    }
}
