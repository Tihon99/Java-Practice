public class StringConversion {
    public static void demonstrateConversion() {
        // String в StringBuilder
        String str = "Hello";
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println("1. String в StringBuilder: " + sb1);
        
        // String в StringBuffer
        StringBuffer sb2 = new StringBuffer(str);
        System.out.println("2. String в StringBuffer: " + sb2);
        
        // StringBuilder в String
        StringBuilder sb3 = new StringBuilder("World");
        String str2 = sb3.toString();
        System.out.println("3. StringBuilder в String: " + str2);
        
        // StringBuffer в String
        StringBuffer sb4 = new StringBuffer("Java");
        String str3 = sb4.toString();
        System.out.println("4. StringBuffer в String: " + str3);
        
        // StringBuilder в StringBuffer
        StringBuilder sb5 = new StringBuilder("Hello");
        StringBuffer sb6 = new StringBuffer(sb5.toString());
        System.out.println("5. StringBuilder в StringBuffer: " + sb6);
        
        // StringBuffer в StringBuilder
        StringBuffer sb7 = new StringBuffer("World");
        StringBuilder sb8 = new StringBuilder(sb7.toString());
        System.out.println("6. StringBuffer в StringBuilder: " + sb8);
    }
}
