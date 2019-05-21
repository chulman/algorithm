public class ImproveQuickUnionUF {
    private int[] id;
    private int[] sz;

    public ImproveQuickUnionUF(int N) {
        id = new int[N];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    //chase parent pointers until reach root
    // i 배열에서 root의 깊이
    private int root(int i){
        while(i != id[i])
        {
            // path cpmpression -> 트리를 평평하게
            id[i] = id[id[i]];
            i = id[i];
        }
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
        // link root of smaller tree to root of larger Tree
        if(sz[i] < sz[j]) {
            id[i] =  j;
            sz[j] += sz[i];
        }else{
            id[j] = j;
            sz[i] += sz[j];
        }
        id[i] = j;
    }
}

