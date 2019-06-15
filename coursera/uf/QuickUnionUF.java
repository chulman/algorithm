package uf;
/**
 * defect
 * trees can gell tall
 * Find too Expensive
 */

public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    //chase parent pointers until reach root
    // i 배열에서 root의 깊이
    private int root(int i){
        while(i != id[i]) i = id[i];
        return i;
    }

    //p와 q가 같은 root를 가지는지 체크
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    // p의 root를 q의 root로 변경해라
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}

