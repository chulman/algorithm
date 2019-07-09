/*
    https://www.acmicpc.net/problem/1517

    Bubble sort Swap이 총 몇 번 발생하는지 알아내는 프로그램
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1517 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] a = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.valueOf(line[i]);
        }
        long ans = mergeSort(a, 0, n-1);
        System.out.println(ans);
    }


    public static long mergeSort(int[] a, int start, int end) {
        if (start == end) {
            return 0;
        }
        int mid = (start+end)/2;
        int[] b = new int[end-start+1];
        long ans = mergeSort(a, start, mid) + mergeSort(a, mid+1, end);

        {
            int i = start;
            int j = mid+1;
            int k = 0;
            while (i <= mid || j <= end) {
                if (i <= mid && (j > end || a[i] <= a[j])) {
                    b[k++] = a[i++];
                } else {
                    ans += (long)(mid-i+1);
                    b[k++] = a[j++];
                }
            }
        }
        for (int i=start; i<=end; i++) {
            a[i] = b[i-start];
        }
        return ans;
    }

    public static int bubbleSort(int[] arr) {
        int swap = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                    swap++;
                }
            }
        }
        return swap;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
