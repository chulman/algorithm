import java.util.*;

class FriendNetwork {

    HashMap<Integer, List<String>> networkMap = new HashMap<>();

    public void add(int key, String... friends) {
        networkMap.put(key, Arrays.asList(friends));
    }

    private int find(int key) {
        return networkMap.get(key).size();
    }

    public int getNetworkNumber(int code) {
        return find(code);
    }
}


public class Q4195 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++) {

            int input_friends = scan.nextInt();
            FriendNetwork network = new FriendNetwork();

            for (int j = 0; j < input_friends; j++) {
                String friends = scan.nextLine();
                network.add(j, friends.split(" "));
//                System.out.println(network.getNetworkNumber(j));
            }
        }
    }
}
