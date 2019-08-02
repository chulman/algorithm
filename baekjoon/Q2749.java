import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

//fib with dynamic
// 값이 매우 크다, 피사노 주기
public class Q2749 {

    private static int mod = 1000000;


    public static long fisanoPeriod(int n) {

        long period = (long) Math.pow(10, 6);
        int p = 1500000; // 피보나치 수열을 10^6로 나누었을 때 주기

        long[] fibo = new long[p];

        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < p; i++) {
            if (i > n) break;
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            fibo[i] %= period;
        }
        if (n >= p) {
            n %= p;
        }
        return fibo[n];
    }


//    private static HashMap<Integer, Long> cache = new HashMap<>();
//    public static Long fibonazziWithTabulation(int n) {
//        long num = 0;
//        for (int i = 0; i < n; i++) {
//            if (i <= 2 && cache.get(i) == null) {
//                if (i == 0) cache.put(i, 0l);
//                else cache.put(i, 1l);
//
//                num = cache.get(i);
//            } else {
//                if (cache.get(i) == null) {
//                    num = cache.get(i - 1) + cache.get(i - 2);
//                    cache.put(i, num);
//                }
//            }
//            System.err.println(num);
//        }
//        return num;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        long result = fisanoPeriod(n);
        System.out.println(result);

    }
}