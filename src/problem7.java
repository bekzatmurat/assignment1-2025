import java.util.Scanner;

public class problem7 {

    public static void generatePermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + str.charAt(i),
                        str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        generatePermutations("", input);
        String nextInput = scanner.next();
        generatePermutations("", nextInput);
    }

    // complexity: time - O(n!), space - O(n!)
}
