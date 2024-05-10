// FactorialMain.java
public class FactorialMain {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        
        // Test the calculator with some sample inputs
        int n = 5;
        int factorial = calculator.calculate(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        n = 0;
        factorial = calculator.calculate(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        // Uncomment the next line to test negative input
        //calculator.calculate(-5); // This will throw IllegalArgumentException
    }
}