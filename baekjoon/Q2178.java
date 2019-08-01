import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;
//최단경로를 생각해야한다.
public class Q2178 {

    private static int[][] map = null;
    private static Boolean[][] visited = null;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int v = Integer.parseInt(tokenizer.nextToken());
        int n = Integer.parseInt(tokenizer.nextToken());

        map = new int[v][n];
        visited = new Boolean[v][n];

        for(int i=0; i < v; i++){
            String s = reader.readLine();
            for(int j=0; j<s.length(); j++){
                map[i][j] = Integer.parseInt(s.substring(j,j+1));
                visited[v][n] = false;
            }
        }


        Queue<Integer> bfsQueue = new ArrayDeque<>();

        bfsQueue.add(map[0][0]);
        visited[0][0] = true;

        while(!bfsQueue.isEmpty()){
            int d = bfsQueue.poll();
            if(d == 1){
                for(int k=0; k<map[d].length; k++){


                }
            }
        }



        reader.close();
    }
}
