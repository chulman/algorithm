import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Q1991 {

    static Queue<String> queue = new LinkedBlockingDeque<>();
    static Map<String, Node> map = new HashMap<>();

    static class Node {
        String data;
        String pre;
        String next;

        public Node(String data, String pre, String next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", pre='" + pre + '\'' +
                    ", next='" + next + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(reader.readLine());

        Node rootNode = null;
        for (int i = 0; i < cnt; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String data = tokenizer.nextToken();
            String leftNode = tokenizer.nextToken();
            String rightNode = tokenizer.nextToken();

            Node node = new Node(data, leftNode, rightNode);
            if (i == 0) rootNode = node;
            map.put(data, node);
        }

        String preResult = "";

        preOrderTraversal(rootNode);

        while (!queue.isEmpty()) preResult += queue.poll();
        System.out.println(preResult);

        String inorderResult = "";
        inOrderTraversal(rootNode);

        while (!queue.isEmpty()) inorderResult += queue.poll();
        System.out.println(inorderResult);

        String postResult = "";
        postOrderTraversal(rootNode);

        while (!queue.isEmpty()) postResult += queue.poll();
        System.out.println(postResult);
    }

    private static void preOrderTraversal(Node node) {

        queue.add(node.data);

        if (node.pre != null && !node.pre.equals("."))
            preOrderTraversal(map.get(node.pre));

        if (node.next != null && !node.next.equals("."))
            preOrderTraversal(map.get(node.next));
    }

    private static void inOrderTraversal(Node node) {
        if (node.pre != null && !node.pre.equals("."))
            inOrderTraversal(map.get(node.pre));

        queue.add(node.data);

        if (node.next != null && !node.next.equals("."))
            inOrderTraversal(map.get(node.next));
    }

    private static void postOrderTraversal(Node node) {

        if (node.pre != null && !node.pre.equals("."))
            postOrderTraversal(map.get(node.pre));
        if (node.next != null && !node.next.equals("."))
            postOrderTraversal(map.get(node.next));

        queue.add(node.data);
    }
}
