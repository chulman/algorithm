import java.util.Scanner;

public class Q10870 {

    public static int fibonazzi(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return fibonazzi(n - 1) + fibonazzi(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibonazzi(n));
    }
}
