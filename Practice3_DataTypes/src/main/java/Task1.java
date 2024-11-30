public class Task1 {
    public static void main(String[] args) {
        byte b = 127;
        byte bNull = 0;
        
        short s = 32767;
        short sNull = 0;
        
        int i = 2147483647;
        int iNull = 0;
        
        long l = 9223372036854775807L;
        long lNull = 0L;
        
        float f = 3.14f;
        float fNull = 0.0f;
        
        double d = 3.141592653589793;
        double dNull = 0.0d;
        
        char c = 'A';
        char cNull = '\u0000';
        
        boolean bool = true;
        boolean boolNull = false;
        
        System.out.println("byte: " + b + ", null: " + bNull);
        System.out.println("short: " + s + ", null: " + sNull);
        System.out.println("int: " + i + ", null: " + iNull);
        System.out.println("long: " + l + ", null: " + lNull);
        System.out.println("float: " + f + ", null: " + fNull);
        System.out.println("double: " + d + ", null: " + dNull);
        System.out.println("char: " + c + ", null: " + (int)cNull);
        System.out.println("boolean: " + bool + ", null: " + boolNull);
    }
}
