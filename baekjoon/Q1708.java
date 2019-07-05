import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1708 {

    public static class Point {
        long x;
        long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
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

        Arrays.sort(arr, Comparator.comparingLong((Point o) -> o.y).thenComparingLong((Point o) -> -o.x));
        Arrays.sort(arr, 1, arr.length, (o1, o2) -> ccw(arr[0],o2,o1));

        Stack<Point> stack = new Stack();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.size() < 2) {
                stack.push(arr[i]);
                continue;
            }
           Point top = stack.pop();

            while(ccw(stack.peek(), top, arr[i])<= 0){
                top = stack.pop();

                if(stack.isEmpty()){
                    break;
                }
            }
            stack.push(top);
            stack.push(arr[i]);
        }
        System.out.println(stack.size());
    }


    private static int ccw(Point A, Point B, Point C) {
        long ccw = (B.x - A.x) * (C.y - A.y) - (C.x - A.x) * (B.y - A.y);

        if (ccw > 0) return 1;
        else if (ccw < 0) return -1;
        else return 0;
    }
}