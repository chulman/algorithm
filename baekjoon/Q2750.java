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
        bubbleSort(arr);
//        selectionSort(arr);
//        insertSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

    }

    // 최소 값을 선택해서 각 인덱스에 채워 넣음
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            swap(arr, i, temp);
        }
    }
    // 두번째 인덱스부터 시작해서 작은 값이 있을 때마다 앞 인덱스에 채워넣고 밀어넣음.
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int aux = i - 1;

            while ((aux >= 0) && (arr[aux] > temp)) {
                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
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
