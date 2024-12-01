public class A {
    public void print(int... numbers) {
        System.out.print("int args: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void print(double... numbers) {
        System.out.print("double args: ");
        for (double n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void print(String first, int... numbers) {
        System.out.print(first + ": ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
