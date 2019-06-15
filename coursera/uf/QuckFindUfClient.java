package uf;

// dynamic-connective client
public class QuckFindUfClient {

    public static void main(String[] args) {
        int N = 10;

        int[][] arr = new int[][]{
                {4, 3}, {3, 8}, {6, 5}, {9, 4}, {2, 1},
                {8, 9}, {5, 0}, {7, 2}, {6, 1}, {1, 0}, {6, 7}
        };

        QuickFindUF uf = new QuickFindUF(N);

        for (int i = 0; i < arr.length; i++) {
            int p = arr[i][0];
            int q = arr[i][1];

            if (!uf.connectd(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
    }
}
