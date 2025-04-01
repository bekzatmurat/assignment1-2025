import java.util.Scanner;

public class problem5 {

    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
        int m = scanner.nextInt();
        System.out.println(Fibonacci(m));
    }

    // complexity: time - O(2^n), space - O(n)
}
