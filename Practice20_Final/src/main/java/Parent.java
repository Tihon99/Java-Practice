public class Parent {
    public final void finalMethod() {
        System.out.println("Этот метод нельзя переопределить");
    }
    
    public void normalMethod() {
        System.out.println("Этот метод можно переопределить");
    }
}
