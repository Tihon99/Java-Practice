public class Main {
    @SuppressWarnings("deprecation")  // Подавляем предупреждение об использовании устаревшего метода
    public static void main(String[] args) {
        AnnotationsDemo demo = new AnnotationsDemo();
        
        System.out.println("=== Демонстрация @Override ===");
        System.out.println(demo.toString());
        
        System.out.println("\n=== Демонстрация @Deprecated ===");
        demo.oldMethod();  // IDE покажет, что метод устарел
        demo.newMethod();
        
        System.out.println("\n=== Демонстрация @SuppressWarnings ===");
        demo.suppressWarningDemo();
        
        System.out.println("\n=== Демонстрация собственной аннотации @Version ===");
        demo.annotatedMethod();
        demo.printAnnotationInfo();
    }
}
