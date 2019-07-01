package sort;

//divide and conquer

public class MergeSort {

    private static Comparable[] aux;

    //a는 정렬 대상 배열
    //aux는 정렬되지 않은 배열
    //lo는 aux의 제일 낮은 인덱스
    //mid는 중간 인덱스
    //hi는 마지막 인덱스
    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        //copy
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        //merge
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0) a[k] = aux[j++];
            else a[k] = aux[i++];

        }
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;

        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);

        merge(a, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);

    }
    public static void bottomUpSort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[a.length];

        //재귀적인 루틴을 돌지 않는다.
        // 수행시간이 N logN인건 변함 없다.

        for(int sz =1; sz <N; sz = sz+sz)
            for(int lo = 0; lo <N-sz; lo+=sz+sz)
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1,N-1));

    }

}
