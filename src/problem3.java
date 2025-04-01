import java.util.Scanner;

public class problem3 {

    public static boolean isPrime(int n, int i) {
        if (i == 1) return true;
        if (n % i == 0) return false;
        if (n < 2) return false;
        return isPrime(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("is prime: " + isPrime(n, n - 1));
    }

    // complexity: time - O(n), space - O(n)
}
