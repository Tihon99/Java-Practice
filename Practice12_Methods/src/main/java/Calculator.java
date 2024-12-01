public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    public void printResult(int result) {
        System.out.println("Результат: " + result);
    }
    
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }
    
    public void printResult(String result) {
        System.out.println("Результат: " + result);
    }
}
