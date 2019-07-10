import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 삽입 정렬, 버블 정렬 , 선택정렬
public class Q2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(reader.readLine());

        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.valueOf(reader.readLine());
        }
        bubbleSort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::println);

    }
    //TODO
    public static void selectionSort(){

    }
    //TODO
    public static void insertSort(){

    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
