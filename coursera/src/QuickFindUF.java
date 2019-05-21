/**
 * Union-Find
 */
/**
 * defect
 * Union too expensive
 * tree are flat, but too expensive to keep them flat
 */

public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for(int i=0; i<N; i++){
             id[i] = i;
        }
    }
    //p의 갚과 q의 갚이 같은지 체크
    public boolean connectd(int p, int q){
        return id[p] == id[q];
    }
    // n-1
    //p의 값을 갖는 인덱스를 모두 q 인덱스의 갚으로 변경.
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        //n-1
        //잠재점 버그
        //Eager-Approach
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid){
                id[i] = qid;
            }
        }
    }
}
