/**
 * Простой калькулятор для демонстрации javadoc
 * @author Student
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Складывает два числа
     * @param a первое число
     * @param b второе число
     * @return сумма чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает второе число из первого
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность чисел
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Умножает два числа
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение чисел
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Делит первое число на второе
     * @param a делимое
     * @param b делитель
     * @return частное
     * @throws ArithmeticException если делитель равен нулю
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("4 * 2 = " + calc.multiply(4, 2));
        System.out.println("10 / 2 = " + calc.divide(10, 2));
    }
}
