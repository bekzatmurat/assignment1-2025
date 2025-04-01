import java.util.Scanner;

public class problem6 {
    public static int Power(int a, int n) {
        if (n==0) return 1;
        return a*Power(a,n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int n=scanner.nextInt();
        System.out.println(Power(a,n));
    }
}
