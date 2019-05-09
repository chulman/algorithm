// 시간복잡도는 O(n)
public class Recursion {

    //1에서 n까지의 합을 구한다.
    public static int sum(int n) {
        if (n == 0) {   //base case
            return n;
        } else {      // recursive case
            return n + sum(n - 1);
        }
    }


    public static int factorial(int n) {
        if (n == 0) {
            return n + 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // x n승 = x* n-1 승  if n>0
    // x 0 = 1
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static int fibonazzi(int f, int n) {
        if (n < 2) {
            return n;
        } else {
            return f * fibonazzi(f, n - 1) + f * fibonazzi(f, n - 2);
        }

    }

    public static double gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }

        if( m % n ==0){
            return n;
        } else{
            return gcd(n, m%n);
        }
    }

    public static double simple_gcd(int m, int n) {
       if(n==0){
           return m;
       }else{
           return simple_gcd(n, m%n);
       }
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(factorial(4));
        System.out.println(power(4, 3));
        System.out.println(fibonazzi(2, 5));
        System.out.println(gcd(5, 6));
        System.out.println(simple_gcd(5, 6));
    }
}
