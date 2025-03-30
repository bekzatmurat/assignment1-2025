public class Assignment1 {
    // Task 1
    // Complexity: linear O(N)
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    // Task 2
    // Complexity: linear O(N)
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return ((findAverage(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
    }
    // Task 3
    // Complexity: O(√N)
    public static boolean isPrime(int n, int i) {
        if (n < 2) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }

    // Task 4
    // Complexity: linear O(N)
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Task 5
    // Complexity: exponential O(2^N)
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6:
    // Complexity: logarithmic O(log N)
    public static int power(int a, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) return power(a * a, n / 2);
        return a * power(a, n - 1);
    }
    // Task 8
    // Complexity: linear O(N)
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
    // Task 9
    // Complexity: exponential O(2^N)
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
  // Task 10
    // Complexity: logarithmic O(log(min(a, b)))
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}


