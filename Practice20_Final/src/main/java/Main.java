public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.finalMethod();
        child.normalMethod();
        
        FinalClass finalClass = new FinalClass();
        finalClass.method();
    }
}
