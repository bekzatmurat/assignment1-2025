import java.util.Scanner;

public class problem8 {

    public static boolean IsAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return IsAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(IsAllDigits(s, 0));
        String n = scanner.next();
        System.out.println(IsAllDigits(n, 0));
    }

    // complexity: time - O(n), space - O(n)
}
