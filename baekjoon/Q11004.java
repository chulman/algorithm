/*
 * https://www.acmicpc.net/problem/11004
 *  - K번째 수
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11004 {

    private static int K = 0;
    private static int[] arr = null;

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        swap(arr, start, mid);

        int pivot = arr[start];

        int i = start, j = end;

        while (i < j) {
            while (pivot < arr[j]) {
                j--;
            }
            while (i < j && pivot >= arr[i]) {
                i++;
            }
            swap(arr, i, j);
        }
        arr[start] = arr[i];
        arr[i] = pivot;
        return i;
    }

    /*
     *   quickSort로 푸니까 시간초과 난다. ㅠㅠ
     */
    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);

            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        K = Integer.parseInt(temp[1]);

        arr = new int[N];
        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        quickSort(arr, 0, arr.length-1);
        System.out.println(arr[K-1]);

    }
}