package datastructure;


public class UnOrderedMaxPQ <Key extends Comparable<Key>> {

    private Key[] pq;
    private int N;


    public UnOrderedMaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty(){
        return N==0;
    }

    //O(1)
    public void insert(Key x){
        pq[N++] = x;
    }

    //O(n)
    public Key delMax(){
        int max = 0;
        //전체 탐색
        //큐가 작다면 괜찮다.
        for(int i=1; i<N; i++){
            if(less(max,i)) max=i;
        }
        exch(max,N-1);
        // loitering을 방지하기 위해 null 출력
        return pq[--N];
    }

    private boolean less(int max, int i){
        return pq[max].compareTo(pq[i]) < 0 ;
    }

    private void exch(int max, int i){
      Key temp = pq[max];
      pq[max] = pq[i];
      pq[i] = temp;
    }
}
