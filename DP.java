public class DP {
    public class FibonacciSimple {
    public static int fibonacci(int n) {
        if (n <= 1) {  // Base cases
            return n;
        }
        
        int a = 0, b = 1;  // Starting values for Fibonacci
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;  // Calculate the next Fibonacci number
            a = b;  // Shift `a` to the next position
            b = result;  // `b` becomes the new result
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}

    
}
