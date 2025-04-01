import java.util.Scanner;

public class problem4 {
    public static long Factorial(int n) {
        if (n <= 1) return 1;
        return n * Factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Factorial(n));
    }
}
