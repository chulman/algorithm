import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
      UnionFind
     /https://www.acmicpc.net/problem/4195
 */
public class Q4195 {

    private static int[] size = new int[100001];
    private static int[] ids = new int[100001];

    public static void init() {
        for (int i = 0; i < size.length; i++) {
            size[i] = 1;
            ids[i] = i;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringJoiner join = new StringJoiner("\n");
        int testCase = Integer.parseInt(br.readLine());


        while (testCase > 0) {
            init();
            int lines = Integer.parseInt(br.readLine());
            Map<String, Integer> friendsMap = new HashMap<>();
            int id = 0;
            for (int i = 0; i < lines; i++) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine());

                String name = tokenizer.nextToken();
                String name2 = tokenizer.nextToken();

                if (!friendsMap.containsKey(name)) {
                    friendsMap.put(name, ++id);
                }

                if (!friendsMap.containsKey(name2)) {
                    friendsMap.put(name2, ++id);
                }
                int id1 = friendsMap.get(name);
                int id2 = friendsMap.get(name2);

                int root1 = find(id1);
                int root2 = find(id2);

                if (root1 != root2) {
                    ids[root2] = root1;
                    size[root1] += size[root2];
                }
                join.add(String.valueOf(size[root1]));
            }
            testCase--;
        }
        System.out.println(join.toString());
        br.close();
    }


    public static int find(int p) {
        if (p == ids[p]) {
            return p;
        }
        return ids[p] = find(ids[p]);
    }
}