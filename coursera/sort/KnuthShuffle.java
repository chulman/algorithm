package sort;

import java.util.Random;

public class KnuthShuffle {
    private static Random random = new Random();
    public static void Shuffle(Object[] arg){
        int N = arg.length;
        //liner sort and shuffle
        for(int i=0; i<N; i++){
            int r = random.nextInt(i)+1;
            exch(arg,i,r);
        }
    }

    public static void exch(Object[] a, int i, int r){
        Object temp = a[i];
        a[i] = a[r];
        a[r] = temp;
    }
}
