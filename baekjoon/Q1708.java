import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1708 {

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pointCnt = Integer.parseInt(br.readLine());
        Point[] arr = new Point[pointCnt];


        for (int i = 0; i < arr.length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            arr[i] = new Point(x, y);
        }

        Arrays.sort(arr, Comparator.comparingInt(value -> value.y));

        Arrays.sort(arr, 1, arr.length, (o1, o2) -> ccw(arr[0], o1, o2));


        Stack<Point> stack = new Stack();
        stack.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.size() < 2) {
                stack.push(arr[i]);
                continue;
            }
            if(ccw(stack.peek(), stack.get(stack.size()-2) , arr[i]) <= 0){
                stack.pop();
            }
            stack.push(arr[i]);
        }
        System.out.println(stack.size());
    }


    private static int ccw(Point A, Point B, Point C) {
        int ccw = (B.x - A.x) * (C.y - A.y) - (C.x - A.x) * (B.y - A.y);

        if (ccw > 0) return 1;
        if (ccw < 0) return -1;
        return 0;
    }
}
