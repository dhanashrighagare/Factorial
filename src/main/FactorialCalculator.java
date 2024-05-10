// FactorialCalculator.java
public class FactorialCalculator {
    public int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculate(n - 1);
    }
}
