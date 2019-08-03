import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Q2667 {

    private static int[][] complex = null;

    private static int cnt = 2;
    private static int[] sum = null;
    static int dx[] = {1,0,-1,0};
    static int dy[] = {0,1,0,-1};


    static void dfs(int x, int y){
        complex[x][y]=cnt;
        sum[cnt]++;
        for(int i=0;i<4;i++){
            if(x+dx[i]<complex.length && x+dx[i]>=0 && y+dy[i]<complex.length && y+dy[i]>=0){
                if(complex[x+dx[i]][y+dy[i]]==1)
                    dfs(x+dx[i],y+dy[i]);
            }
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        complex = new int[n][n];
        sum = new int[n*n];
        for (int i = 0; i < complex.length; i++) {
            String line = reader.readLine();
            for (int j = 0; j < line.length(); j++) {
                complex[i][j] = Integer.parseInt(Character.toString(line.charAt(j)));
            }
        }
        reader.close();

        for (int i = 0; i < complex.length; i++) {
            for (int j = 0; j < complex[i].length; j++) {
                if (complex[i][j] == 1) {
                    dfs( i, j);
                    cnt++;
                }
            }
        }
        Arrays.sort(sum);
        System.out.println(cnt-2);
        for(int i=n*n-cnt+2;i<n*n;i++){
            System.out.println(sum[i]);
        }
    }
}
