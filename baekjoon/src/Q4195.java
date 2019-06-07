import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
      UnionFind
     /https://www.acmicpc.net/problem/4195
 */

class Network {
    private int[] arr = new int[100000];

    public Network() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    private int root(int i) {
        while (i != arr[i]) i = arr[i];
        return i;
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        arr[i] = j;
    }

    public int getFriendsCount(int friendsCount) {

        int networkCount = 0;
        for (int i = 0; i <= friendsCount; i++) {
            if (connected(i, friendsCount)) {
                networkCount++;
            }
        }
        return networkCount;
    }

}

public class Q4195 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase > 0) {
            int lines = Integer.parseInt(br.readLine());

            Network network = new Network();
            Map<String, Integer> friendsMap = new HashMap<>();

            int friendsCount = 0;
            for (int i = 0; i < lines; i++) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine());
                String friends1 = tokenizer.nextToken();
                String friends2 = tokenizer.nextToken();

                if (!friendsMap.containsKey(friends1)) {
                    ++friendsCount;
                    friendsMap.put(friends1, friendsCount);
                }

                if (!friendsMap.containsKey(friends2)) {
                    ++friendsCount;
                    friendsMap.put(friends2, friendsCount);
                }
                network.union(friendsMap.get(friends1), friendsMap.get(friends2));
                System.out.println(network.getFriendsCount(friendsCount));
            }
            testCase--;
        }
        br.close();
    }
}