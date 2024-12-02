public class A {
    int a1;              // package-private
    public int a2;       // public
    protected int a3;    // protected
    private int a4;      // private

    void method1() {     // package-private
        System.out.println("method1");
    }

    public void method2() {    // public
        System.out.println("method2");
    }

    protected void method3() { // protected
        System.out.println("method3");
    }
    
    private void method4() {   // private
        System.out.println("method4");
    }
}
