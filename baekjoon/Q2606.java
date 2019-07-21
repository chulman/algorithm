/*
 * N-Queen
 * https://www.acmicpc.net/problem/2606
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 연결리스트를 이용한 BFS 구현
 */
public class Q2606 {

    private static LinkedList<Integer>[] list = null;
    private static Boolean[] byrusCheck = null;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(reader.readLine());

        list = new LinkedList[computers];
        byrusCheck = new Boolean[computers];
        for(int i=0; i<list.length; i++){
            list[i] = new LinkedList();
            byrusCheck[i] = false;
        }

        int edge = Integer.parseInt(reader.readLine());

        for(int i=0; i<edge; i++){
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            list[n-1].add(m-1);
            list[m-1].add(n-1);
        }

        //traversal
        Queue<Integer> bfs = new ArrayDeque<>();
        byrusCheck[0] = true;
        bfs.add(0);

        while(!bfs.isEmpty()){
            int v = bfs.poll();
            while(!list[v].isEmpty()){
                int n = list[v].poll();
                if(!byrusCheck[n]) {
                    bfs.add(n);
                    byrusCheck[n] = true;
                }
            }
        }
        System.out.println(Arrays.stream(byrusCheck).filter(b->b==true).count()-1);
    }
}

/**
 * 인접행렬을을 이용한 BFS 구현
 */
//public class Q2606 {
//
//    private static int[][] map = null;
//    private static Boolean[] byrusCheck = null;
//
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int computer = scan.nextInt();
//
//        map = new int[computer][computer];
//        byrusCheck = new Boolean[computer];
//
//        for(int i=0; i<byrusCheck.length; i++){
//            byrusCheck[i] = false;
//        }
//
//        for(int i=0; i<map.length; i++){
//            for(int j=0; j<map[i].length; j++){
//                map[i][j] = 0;
//            }
//        }
//
//        int edge = scan.nextInt();
//
//        for(int i=0; i< edge; i++){
//           int n = scan.nextInt();
//           int m = scan.nextInt();
//            map[n-1][m-1] = 1;
//            map[m-1][n-1] = 1;
//        }
//
//        Queue<Integer> queue = new ArrayDeque<>();
//
//        queue.add(0);
//        byrusCheck[0] = true;
//
//        while(!queue.isEmpty()){
//            int node = queue.poll();
//            for(int k=0; k < map[node].length; k++){
//                if(map[node][k]==1 && byrusCheck[k]==false){
//                    queue.add(k);
//                    byrusCheck[k] = true;
//                }
//            }
//        }
//
//        System.out.println(Arrays.stream(byrusCheck).filter(b->b==true).count()-1);
//    }
//}