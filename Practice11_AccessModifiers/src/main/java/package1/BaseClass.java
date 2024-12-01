package package1;

public class BaseClass {
    private int privateField = 1;
    int defaultField = 2;
    protected int protectedField = 3;
    public int publicField = 4;
    
    private void privateMethod() {
        System.out.println("Private method");
        System.out.println("Can access privateField: " + privateField);
    }
    
    void defaultMethod() {
        System.out.println("Default method");
        System.out.println("Can access defaultField: " + defaultField);
        privateMethod();
    }
    
    protected void protectedMethod() {
        System.out.println("Protected method");
        System.out.println("Can access protectedField: " + protectedField);
    }
    
    public void publicMethod() {
        System.out.println("Public method");
        System.out.println("Can access publicField: " + publicField);
    }
}
